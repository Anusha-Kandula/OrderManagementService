package com.ordermanagementeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OrdermanagementEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdermanagementEurekaApplication.class, args);
	}

}
