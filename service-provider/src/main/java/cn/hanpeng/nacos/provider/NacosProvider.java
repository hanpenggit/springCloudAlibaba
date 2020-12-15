package cn.hanpeng.nacos.provider;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvider.class,args);
    }

    @RestController
    class EchoController {
        @Value("${server.port}")
        private String port;

        @GetMapping("/echo/{name}")
        public String echo(@PathVariable String name) {
            return "Hello " + name +",port:"+port;
        }
    }

    /*@RestController
    @RefreshScope
    class ConfigController {

        @Value("${config.port}")
        private String port;

        @GetMapping("/print/port")
        public String showPort(){
            return port;
        }

    }*/

}
