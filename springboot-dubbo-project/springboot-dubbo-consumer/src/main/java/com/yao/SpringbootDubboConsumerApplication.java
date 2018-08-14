package com.yao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class SpringbootDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboConsumerApplication.class, args);
	}
}
