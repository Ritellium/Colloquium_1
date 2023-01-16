package org.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class WebServiceApp {
    public static final String app = "controller/";
    public static void main(String[] args) {
        SpringApplication.run(WebServiceApp.class, args);
    }
}
