package com.ordermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.ordermanagement.*"})
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrdermanagementserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdermanagementserviceApplication.class, args);
	}

}
