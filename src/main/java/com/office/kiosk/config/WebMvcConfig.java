package com.office.kiosk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.office.kiosk.paging.kioskPageDto;

@Configuration
public class WebMvcConfig {
	
	@Bean
	public RestTemplate restTemplate() {
		
		return new RestTemplate();
		
	}
	
	
}
