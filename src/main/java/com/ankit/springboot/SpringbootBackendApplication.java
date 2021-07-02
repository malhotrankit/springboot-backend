package com.ankit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // @ComponentScan + @EnableAutoConfiguration + @Configuration
public class SpringbootBackendApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringbootBackendApplication.class, args);  // Initializes spring container and creates bean of every class that has @Bean or @Service mentioned 
		
	}

}
