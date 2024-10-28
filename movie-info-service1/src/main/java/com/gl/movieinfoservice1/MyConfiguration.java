package com.gl.movieinfoservice1;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.gl.movieinfoservice1") 
public class MyConfiguration {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	    return builder.build();
	}
}
