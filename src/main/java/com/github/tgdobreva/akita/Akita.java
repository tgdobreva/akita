package com.github.tgdobreva.akita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Akita {

	public static void main(String[] args) throws Exception {
		try {
			SpringApplication.run(Akita.class, args);
		} catch (Exception ex) {
			System.err.println("Could not start Akita");
			System.exit(1);
		}
	}
}
