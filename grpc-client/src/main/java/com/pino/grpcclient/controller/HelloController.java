package com.pino.grpcclient.controller;

import com.pino.grpcclient.client.HelloGrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloGrpcClient helloGrpcClient;

    public HelloController(HelloGrpcClient helloGrpcClient) {
        this.helloGrpcClient = helloGrpcClient;
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return helloGrpcClient.sayHello(name);
    }
}
