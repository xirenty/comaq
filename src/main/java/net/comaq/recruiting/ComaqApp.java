package net.comaq.recruiting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "net.comaq")
public class ComaqApp {

	public static void main(String[] args) {

		SpringApplication.run(ComaqApp.class, args);
	}

}