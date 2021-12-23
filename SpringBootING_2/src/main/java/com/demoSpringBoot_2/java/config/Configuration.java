package com.demoSpringBoot_2.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean
	public RestTemplate restTemp() {
		return new RestTemplate();
	}
	
}
