package com.zhansc.ahsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class AhSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(AhSecurityApplication.class, args);
    }

}
