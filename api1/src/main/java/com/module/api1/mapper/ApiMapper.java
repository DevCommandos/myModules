package com.module.api1.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ApiMapper {
    List<Map<String,Object>> test() throws Exception;
}
