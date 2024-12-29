package com.example.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class LoggingApplication {

	private static final Logger logger = LoggerFactory.getLogger(LoggingApplication.class);

	public static void main(String[] args) {
		logger.info("info msg");
		logger.warn("warn msg");
		logger.error("err msg");
		SpringApplication.run(LoggingApplication.class, args);
	}

}