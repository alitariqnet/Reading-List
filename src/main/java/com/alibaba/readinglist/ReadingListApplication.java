package com.alibaba.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ReadingListApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication();
		application.run(ReadingListApplication.class, args);
		application.setAdditionalProfiles("dev");
	}

}
