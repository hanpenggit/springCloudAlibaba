package cn.hanpeng.nacos.feign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider",fallback = NacosFeignFallBack.class)
public interface NacosFeign {

    @GetMapping("/echo/{name}")
    String echo(@PathVariable String name);
}
