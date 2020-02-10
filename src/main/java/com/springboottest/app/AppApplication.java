
package com.springboottest.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {
    public AppApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }
}