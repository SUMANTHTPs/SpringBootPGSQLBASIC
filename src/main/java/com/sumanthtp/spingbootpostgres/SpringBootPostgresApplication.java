package com.sumanthtp.spingbootpostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootPostgresApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootPostgresApplication.class, args);

		ProductService service = context.getBean(ProductService.class);

		service.getAllProducts();
	}

}
