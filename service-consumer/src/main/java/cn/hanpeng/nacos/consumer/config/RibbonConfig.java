package cn.hanpeng.nacos.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfig {

    @Bean
    public IRule ribbonRule(){
        // 随机的负载均衡策略对象
        return new RandomRule();
    }
}
