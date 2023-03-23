package com.module.api1.controller;

import com.module.util.ModuleUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return ModuleUtil.printMsg();
    }

}
