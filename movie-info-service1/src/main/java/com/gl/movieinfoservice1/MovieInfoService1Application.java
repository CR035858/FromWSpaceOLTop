package com.gl.movieinfoservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MovieInfoService1Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoService1Application.class, args);
		System.out.println("Movie Info Service Started....");
	}

}
