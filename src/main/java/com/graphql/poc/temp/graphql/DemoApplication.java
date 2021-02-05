package com.graphql.poc.temp.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Import(GraphqlConfiguration.class)
@PropertySource("classpath:application-local.yml")
//@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class DemoApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "demo");
        SpringApplication.run(DemoApplication.class, args);
    }

}
