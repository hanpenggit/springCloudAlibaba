package cn.hanpeng.nacos.feign.service;

import org.springframework.stereotype.Component;

@Component
public class NacosFeignFallBack implements  NacosFeign{

    @Override
    public String echo(String name) {
        return name+"凉凉";
    }
}
