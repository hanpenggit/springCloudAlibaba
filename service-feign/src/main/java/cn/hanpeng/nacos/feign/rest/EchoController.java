package cn.hanpeng.nacos.feign.rest;

import cn.hanpeng.nacos.feign.service.NacosFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @Autowired
    private NacosFeign nacosFeign;

    @GetMapping("/echo/{name}")
    public String echo(@PathVariable String name){
        return nacosFeign.echo(name);
    }
}
