package com.redisTest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserProfile {

    private String name;
    private Integer age;

}
