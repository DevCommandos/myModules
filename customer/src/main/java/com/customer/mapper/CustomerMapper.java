package com.customer.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CustomerMapper {

    List<Map<String, Object>> selectById() throws Exception;

}
