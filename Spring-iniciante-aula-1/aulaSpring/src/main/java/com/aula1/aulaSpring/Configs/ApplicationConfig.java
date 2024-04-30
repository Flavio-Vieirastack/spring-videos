package com.aula1.aulaSpring.Configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "sdk-key")
public class ApplicationConfig {
    private String id;
    private String apiKey;
}
