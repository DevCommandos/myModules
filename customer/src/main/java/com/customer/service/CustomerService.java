package com.customer.service;

import com.customer.mapper.CustomerMapper;
import com.customer.mapper.OrderMasterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerMapper customerMapper;
    private final OrderMasterMapper orderMasterMapper;

    public List<Map<String, Object>> selectById () throws Exception {
        return customerMapper.selectById();
    }

    @Transactional
    public Integer insertCustomer () throws Exception {
        Integer resultCnt = customerMapper.insertCustomer();
        Integer resultCnt2 = orderMasterMapper.insertOrderMaster();
        int a = 5/0;
        return resultCnt;
    }
}
