package com.awslearning.customer_service;

import org.springframework.boot.SpringApplication;

public class TestAwsCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(AwsCustomerServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
