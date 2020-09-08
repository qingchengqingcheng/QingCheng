package com.qingcheng.user.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {


    /**
     * @Discription TOOD 注入RestTemplate
     * @author qingcheng
     * @Date 2020/9/5 14:01
     * RestTemplate 默认开启负载均衡 如果需要实现serviceId调用其他服务 需要添加@LoadBalanced注解
     * @return: org.springframework.web.client.RestTemplate
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
