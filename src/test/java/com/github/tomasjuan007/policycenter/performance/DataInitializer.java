package com.github.tomasjuan007.policycenter.performance;

import com.github.tomasjuan007.policycenter.dal.mapper.TbRuleExtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DataInitializer {
    @Autowired
    private TbRuleExtMapper tbRuleExtMapper;

    public void init() {
        for (long i=0; i<100; i++)
        tbRuleExtMapper.insertPerformanceRecord(i);
    }


}
