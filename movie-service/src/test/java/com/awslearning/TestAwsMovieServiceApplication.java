package com.awslearning;

import org.springframework.boot.SpringApplication;

public class TestAwsMovieServiceApplication {

	public static void main(String[] args) {
		SpringApplication
				.from(AwsMovieServiceApplication::main)
				.with(TestcontainersConfiguration.class)
				.run(args);
	}

}
