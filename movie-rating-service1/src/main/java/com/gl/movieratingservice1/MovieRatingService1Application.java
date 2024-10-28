package com.gl.movieratingservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieRatingService1Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingService1Application.class, args);
		System.out.println("Movie rating Service Started...");
	}

}
