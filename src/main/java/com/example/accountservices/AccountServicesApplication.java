package com.example.accountservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZonedDateTime;

@SpringBootApplication
public class AccountServicesApplication {

	public static void main(String[] args) {
		System.out.println( ZonedDateTime.now() );
		//SpringApplication.run(AccountServicesApplication.class, args);
	}

}
