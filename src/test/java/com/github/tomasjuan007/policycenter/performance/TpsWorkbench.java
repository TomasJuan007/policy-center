package com.github.tomasjuan007.policycenter.performance;

import com.google.common.math.LongMath;

import java.math.RoundingMode;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class TpsWorkbench {
    private static final int N_THRESHOLDS = 4;
    private static final ExecutorService executorService = Executors.newFixedThreadPool(N_THRESHOLDS);
    private static final CountDownLatch countDownLatch = new CountDownLatch(N_THRESHOLDS);

    private static final AtomicLong totalCount = new AtomicLong(0L);

    private static final int TIME_THRESHOLD = 10;
    private static final AtomicInteger count = new AtomicInteger(TIME_THRESHOLD);

    private static volatile boolean running = true;
    private static final CyclicBarrier barrier = new CyclicBarrier(N_THRESHOLDS);

    public static void run(Job job) throws Exception {
        System.out.println("Job start...");
        long startTime = System.currentTimeMillis();
        for (int i=0; i<N_THRESHOLDS; i++) {
            executorService.submit(new Worker(job));
        }
        final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            if (count.decrementAndGet() == 0) {
                running = false;
                scheduledExecutorService.shutdown();
            }
        }, 1L, 1L, TimeUnit.SECONDS);

        countDownLatch.await();
        long endTime = System.currentTimeMillis();

        long totalCount = TpsWorkbench.totalCount.get();
        System.out.println(N_THRESHOLDS + " threads, " + totalCount + " executions in " + TIME_THRESHOLD + " seconds.");

        long cost = LongMath.divide(endTime-startTime, 1000, RoundingMode.HALF_EVEN);
        long tps = LongMath.divide(totalCount, cost, RoundingMode.HALF_EVEN);

        System.out.println("exactly run time: "+ cost + "s, tps: " + tps +"/s");
    }

    public static class Worker implements Runnable {
        private final Job job;

        Worker(Job job) {
            this.job = job;
        }

        int count = 0;

        @Override
        public void run() {
            try {
                barrier.await();
                while (running) {
                    this.job.execute();
                    count++;
                }
            } catch (Exception e) {
                System.out.println("Thread["+Thread.currentThread().getId()+"] exception: "+e.getMessage());
            } finally {
                totalCount.getAndAdd(count);
                countDownLatch.countDown();
            }
        }
    }
}
