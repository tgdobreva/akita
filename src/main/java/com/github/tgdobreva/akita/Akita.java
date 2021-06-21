package com.github.tgdobreva.akita;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Akita {

	private static final Logger LOG = LoggerFactory.getLogger(Akita.class);

	public static void main(String[] args) throws Exception {
		try {
			SpringApplication.run(Akita.class, args);
		} catch (Exception ex) {
			LOG.error("Could not start Akita", ex);
			System.exit(1);
		}
	}
}
