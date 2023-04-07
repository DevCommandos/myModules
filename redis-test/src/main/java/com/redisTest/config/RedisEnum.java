package com.redisTest.config;

public enum RedisEnum {

    REDIS_SERVER("localhost", 6379);

    private final String host;
    private final int port;

    RedisEnum(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
}
