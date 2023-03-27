package com.customer.controller;

import com.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final CustomerService customerService;

    @GetMapping("/")
    public List<Map<String, Object>> hello() throws Exception {
        List<Map<String, Object>> map = customerService.selectById();
        return map;
    }

    @GetMapping("/test")
    public Integer insertTest() throws Exception {
        return customerService.insertCustomer();
    }
}
