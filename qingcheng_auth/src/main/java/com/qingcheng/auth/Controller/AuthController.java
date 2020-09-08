package com.qingcheng.auth.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/getAuth",produces = "application/json;charset=utf-8")
    public String getAuth() {
        return port;
    }
}
