package client.controller;

import client.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private HelloRemote helloRemote; //openfeign的web service代理对象来访问服务，默认轮询策略调用服务

    @RequestMapping("/hello")
    public String index() {
        return helloRemote.hello();
    }

}