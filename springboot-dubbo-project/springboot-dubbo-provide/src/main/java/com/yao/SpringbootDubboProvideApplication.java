package com.yao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDubboProvideApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootDubboProvideApplication.class, args);
//		new SpringApplicationBuilder(SpringbootDubboProvideApplication.class)
//				.web(false) // 非 Web 应用
//				.run(args);
	}
}
