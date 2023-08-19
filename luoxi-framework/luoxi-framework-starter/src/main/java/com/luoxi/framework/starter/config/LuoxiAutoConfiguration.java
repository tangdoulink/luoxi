package com.luoxi.framework.starter.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author pengbo.zhao
 * @version 1.0
 * @Date 2023/8/1 18:08
 */

public class LuoxiAutoConfiguration {

//    @Value("${spring.application.name}")
//    private String applicationName;
//
//    @Bean
//    @ConditionalOnBean(value = NacosWatch.class)
//    @ConditionalOnProperty(value = {"spring.cloud.nacos.discovery.watch.enabled"}, matchIfMissing = true)
//    // 假如配置了错误的name值，若matchIfMissing为true，配置类不会加载
//    // 假如配置了正确的name值，若matchIfMissing为true，配置类会加载
//    public NacosWatch serviceRegisterNacos(NacosServiceManager nacosServiceManager, NacosDiscoveryProperties nacosDiscoveryProperties) {
//        nacosDiscoveryProperties.getMetadata().put("service.name",applicationName);
//        nacosDiscoveryProperties.getMetadata().put("register.time", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        return new NacosWatch(nacosServiceManager,nacosDiscoveryProperties);
//    }

}
