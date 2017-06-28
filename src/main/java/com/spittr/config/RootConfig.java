package com.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by jotaiwan on 17/06/2017.
 */
@Configuration
@ComponentScan(basePackages = {"com.spittr"},
        excludeFilters = {@ComponentScan.Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
public class RootConfig {
}
