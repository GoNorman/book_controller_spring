package com.sbook.sbook;

import com.sbook.sbook.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.delivery.request"})
@EntityScan("com.delivery.domain")
@EnableJpaRepositories("com.delivery.repository")
@ComponentScan(basePackageClasses = BookController.class)
public class SBookApplication extends SpringBootServletInitializer {

    @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BookController.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SBookApplication.class, args);
    }

}
