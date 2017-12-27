package com.maryanto.dimas.keycloak.service.example.keycloakservicerestexample;

import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@KeycloakConfiguration
public class KeycloakServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakServiceApplication.class, args);
	}
}
