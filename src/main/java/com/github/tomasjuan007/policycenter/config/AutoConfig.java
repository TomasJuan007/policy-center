package com.github.tomasjuan007.policycenter.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.github.tomasjuan007.policycenter.dal.mapper"})
public class AutoConfig {
}
