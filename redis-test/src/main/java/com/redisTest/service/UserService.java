package com.redisTest.service;

import com.redisTest.dto.UserProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ExternalService externalService;
    private final StringRedisTemplate redisTemplate;

    public UserProfile getUserProfile(String userId) {
        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();

        String name = null;

        String cachedName = valueOperations.get("nameKey:" + userId);
        if (cachedName != null) {
            name = cachedName;
        } else {
            name = externalService.getUserName();
            valueOperations.set("nameKey:" + userId, name, 5, TimeUnit.DAYS);
        }
        Integer age = externalService.getUserAge();

        return new UserProfile(name, age);
    }

}
