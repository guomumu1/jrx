package com.jrx;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableBatchProcessing
public class SpringbatchGlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbatchGlApplication.class, args);
	}

}
