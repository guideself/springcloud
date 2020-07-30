package client.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "provider") //服务方application.name
public interface HelloRemote {

    @RequestMapping("/hello") //服务方提供的接口，路径、方法、参数要一样
    public String hello();

}
