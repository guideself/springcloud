package provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private Environment env;

    @RequestMapping("/hello")
    public String index() {
        return "server is "+ env.getProperty("server.port");
    }
}
