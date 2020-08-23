package com.example.faraz;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
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
    
    @Value("${server.port:8080}")    
    private String port;
    
    @GetMapping("/test")
    public String test1() {
	return "Haan bhaee from " + port;
    }

}
