package com.unw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.List;

/**
 * @author UNGERW
 */
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        // Print out the loaded bean definitions
        List<String> beanNames = Arrays.asList(ctx.getBeanDefinitionNames());
        beanNames.forEach((name)->System.out.println(" - " + name));

    }

}
