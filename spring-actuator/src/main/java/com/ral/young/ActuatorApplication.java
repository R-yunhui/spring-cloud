package com.ral.young;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author renyunhui
 * @description 这是一个ActuatorApplication类
 * @date 2024-08-15 09-52-41
 * @since 1.0.0
 */
@SpringBootApplication
@EnableScheduling
public class ActuatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }
}
