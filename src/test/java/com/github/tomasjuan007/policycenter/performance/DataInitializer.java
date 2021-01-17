package com.github.tomasjuan007.policycenter.performance;

import com.github.tomasjuan007.policycenter.dal.mapper.TbRuleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DataInitializer {
    @Autowired
    private TbRuleMapper tbRuleMapper;

    @Test
    public void test() {
        for (long i=0; i<2; i++)
        tbRuleMapper.insertPerformanceRecord(i);
    }


}
