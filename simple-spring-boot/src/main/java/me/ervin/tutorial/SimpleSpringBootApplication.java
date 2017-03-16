package me.ervin.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhiyingyang
 * @version 2017-03-15 18:01
 */
@SpringBootApplication
@RestController
public class SimpleSpringBootApplication {

    @RequestMapping("/")
    public String index(){
        return "Hello world. I'm spring boot.";
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringBootApplication.class, args);
    }
}
