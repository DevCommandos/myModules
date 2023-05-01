package com.kafkaTest.service;

import org.springframework.stereotype.Service;

@Service
public class ExternalService {

    public String getUserName() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "commandos";

    }

    public int getUserAge() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 30;

    }

}
