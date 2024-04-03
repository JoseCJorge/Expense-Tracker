package com.msscmongodb.springbootmongodbexample;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongock
public class SpringBootMongodbExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbExampleApplication.class, args);
	}

}
