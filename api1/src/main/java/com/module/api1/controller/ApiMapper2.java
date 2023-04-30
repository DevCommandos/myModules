package com.module.api1.controller;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ApiMapper2 {
    List<Map<String,Object>> test() throws Exception;
}
