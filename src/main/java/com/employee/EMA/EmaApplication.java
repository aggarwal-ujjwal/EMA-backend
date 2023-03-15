package com.employee.EMA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class EmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmaApplication.class, args);
	}

}
