package com.example;

import com.example.domin.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
@SpringBootApplication
public class WaterdatabaseApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(WaterdatabaseApplication.class, args);
		System.out.println(context.getBean("user"));
	}
}
