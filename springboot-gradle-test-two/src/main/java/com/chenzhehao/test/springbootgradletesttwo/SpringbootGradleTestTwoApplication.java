package com.chenzhehao.test.springbootgradletesttwo;

import com.chenzhehao.gradle.test.springbootgradletestone.dto.TestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGradleTestTwoApplication {

	@Autowired
	private ApplicationContext application;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGradleTestTwoApplication.class, args);
	}

	@RequestMapping("/")
	public Object jvmboot(){
		TestDto  testDto = new TestDto();
		testDto.setName(application.getApplicationName());
		return "success jvm: "+testDto.getName();
	}
}
