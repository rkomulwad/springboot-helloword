package com.sb.sample.sbhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbHelloworldApplication.class, args);
	}

	int foo(int a) {
		int b = 12;
		if (a == 1) {
			return b;
		}
		return b;  // Noncompliant
	}

}
