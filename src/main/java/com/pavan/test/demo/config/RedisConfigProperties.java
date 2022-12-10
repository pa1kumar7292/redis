package com.pavan.test.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties(prefix = "redis")
@Data
public class RedisConfigProperties {

    private String host;
    private Integer port;
    private Integer defaultExpiryTime;
    // Mapping of cacheNames to expira-after-write timeout in seconds
    private Map<String, Long> cacheExpirations = new HashMap<>();
}
