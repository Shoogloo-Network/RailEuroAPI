package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableScheduling
@SpringBootApplication

@PropertySource("file:/opt/work/property/rail.properties")
public class CommadController {

	public static void main(String[] args) {
		SpringApplication.run(CommadController.class, args);
	}

	
}