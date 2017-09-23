package com.softwarestable.currencyocr;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CurrencyocrApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyocrApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println(">>>>>>>>> Let's inspect the beans provided by Spring Boot:");

            String value = ImageParse.parseImage("1b29cc2a.jpg");
            System.out.println(">>>>>>>> value=" + value.trim());
            value = ImageParse.parseImage("52d1f182.jpg");
            System.out.println(">>>>>>>> value=" + value.trim());
            value = ImageParse.parseImage("90f4e673.jpg");
            System.out.println(">>>>>>>> value=" + value.trim());
            value = ImageParse.parseImage("5316fc18.jpg");
            System.out.println(">>>>>>>> value=" + value.trim());
            value = ImageParse.parseImage("5dad01d4.jpg");
            System.out.println(">>>>>>>> value=" + value.trim());

            value = ImageParse.parseImage("94e2f004.jpg");
            System.out.println(">>>>>>>> value=" + value.trim());

        };
    }
}
