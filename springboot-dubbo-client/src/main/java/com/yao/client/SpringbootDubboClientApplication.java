package com.yao.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDubboClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootDubboClientApplication.class, args);
//		new SpringApplicationBuilder(SpringbootDubboProvideApplication.class)
//				.web(false) // 非 Web 应用
//				.run(args);
	}
}
