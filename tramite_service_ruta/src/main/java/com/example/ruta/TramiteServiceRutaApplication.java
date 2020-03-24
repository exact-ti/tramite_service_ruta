package com.example.ruta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TramiteServiceRutaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TramiteServiceRutaApplication.class, args);
	}

}
