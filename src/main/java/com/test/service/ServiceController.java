package com.test.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/svc")
public class ServiceController {
    @GetMapping
    public String getMsg() {
        return  "Testing simple service";
    }
}
