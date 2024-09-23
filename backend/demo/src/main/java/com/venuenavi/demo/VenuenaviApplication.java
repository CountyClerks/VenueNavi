package com.venuenavi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class VenuenaviApplication {

	// @Bean
	// public RestTemplate restTemplate(){
	// 	return new RestTemplate();
	// }
	public static void main(String[] args) {
		SpringApplication.run(VenuenaviApplication.class, args);
	}

	// public String getApiResponse(String apiUrl){
	// 	Response
	// }

}
		