package com.syh.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class ConfigBean
{
//    @Bean
    // 使用Ribbon负载均衡
//    @LoadBalanced
//    public RestTemplate getRestTemplate()
//    {
//         return new RestTemplate();
//    }

    // 修改Ribbon默认的负载均衡算法
    @Bean
    public IRule myRule () {
        return new RoundRobinRule();
    }
}

