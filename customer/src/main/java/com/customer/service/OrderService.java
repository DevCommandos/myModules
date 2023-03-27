package com.customer.service;

import com.customer.mapper.OrderMasterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderMasterMapper orderMasterMapper;

    public Integer insertOrderMaster() throws Exception {
        return orderMasterMapper.insertOrderMaster();
    }


}
