package com.opitzconsulting.demo.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class BenutzerApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello ";
	}
	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BenutzerApplication.class);
		app.run(BenutzerApplication.class, args);
	}
}
