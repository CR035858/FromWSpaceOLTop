package com.gl.moviecatalog1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieCatalog1Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalog1Application.class, args);
		System.out.println("Movie Catalog Service Started...");
	}

	

}
