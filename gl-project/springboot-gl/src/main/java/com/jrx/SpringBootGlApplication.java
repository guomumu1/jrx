package com.jrx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.jrx.repository")
@EnableTransactionManagement
public class SpringBootGlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGlApplication.class, args);
	}

}
