package com.bookmyticket.theaterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TheaterserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheaterserviceApplication.class, args);
	}

}
