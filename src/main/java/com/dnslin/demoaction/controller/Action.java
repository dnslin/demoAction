package com.dnslin.demoaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Action {

    @GetMapping("/action")
    public String action(){
        return "访问action成功🎉🎉🎉🎉🎉";
    }
}
