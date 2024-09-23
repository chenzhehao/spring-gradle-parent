package com.chenzhehao.gradle.test.springbootgradletestone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGradleTestOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGradleTestOneApplication.class, args);
	}

	@RequestMapping("/")
	public Object jvmboot(){
		return "success jvm";
	}
}
