package com.gome.garbage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages="com.gome.garbage.*")
public class GarbageApplication {
	public static void main(String[] args) {
		SpringApplication.run(GarbageApplication.class, args);
	}
}
