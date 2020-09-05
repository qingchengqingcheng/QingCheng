package com.qingcheng.user.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getUserByAuth", produces = "application/json;charset=utf-8")
    public String getUserByAuth() {
        String result = restTemplate.getForObject("http://qingcheng-auth/auth/getAuth", String.class);
        return result;
    }
}
