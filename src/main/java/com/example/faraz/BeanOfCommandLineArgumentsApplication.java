package com.example.faraz;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanOfCommandLineArgumentsApplication implements CommandLineRunner {

    public static void main(String[] args) {
	SpringApplication.run(BeanOfCommandLineArgumentsApplication.class, args);
    }

    @Autowired
    private ApplicationArguments aa;

    @Override
    public void run(String... args) throws Exception {
	Arrays.stream(aa.getSourceArgs()).forEach(System.err::println);
    }

}
