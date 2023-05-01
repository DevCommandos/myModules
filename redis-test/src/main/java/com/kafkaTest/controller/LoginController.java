package com.kafkaTest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final StringRedisTemplate redisTemplate;

    Map<String, String> sessionMap = new HashMap<>();


    @GetMapping("/login")
    public String login(HttpSession httpSession, @RequestParam String name){
        sessionMap.put(httpSession.getId(), name);
        return "save";
    }

    @GetMapping("/myName")
    public String login(HttpSession httpSession){
        return sessionMap.get(httpSession.getId());
    }
}
