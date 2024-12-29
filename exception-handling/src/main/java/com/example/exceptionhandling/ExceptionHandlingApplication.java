package com.example.exceptionhandling;

import com.example.exceptionhandling.product.ProductNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;

@SpringBootApplication
public class ExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionHandlingApplication.class, args);
	}

	@PutMapping(value = "/products/{id}")
	public ResponseEntity<Object> updateProduct() {
		throw new ProductNotFoundException();
	}

}
