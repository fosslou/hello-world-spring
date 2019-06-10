package com.ibm.developer.helloworldspring;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class HelloWorldSpringApplication extends SpringBootServletInitializer {


   public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpringApplication.class, args);
    }
}
