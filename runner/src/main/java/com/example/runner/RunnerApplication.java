package com.example.runner;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

// i just make separate profiles instead
// AppRunner represents "implement ApplicationRunner"
// CmdRunner represents "implement CommandLineRunner"
// the commented out code below is the raw form.
@SpringBootApplication
public class RunnerApplication { // implement ApplicationRunner
    public static void main(String[] args) {
        SpringApplication.run(RunnerApplication.class, args);
    }

//    @Override
//    public void run (ApplicationArguments arg0) throws Exception {
//        System.out.println("Hello World from Application Runner");
//    }
}

//@SpringBootApplication
//public class RunnerApplication implements CommandLineRunner {

//    public static void main(String[] args) {
//        SpringApplication.run(RunnerApplication.class, args);
//    }

//    @Override
//    public void run (String... arg0) throws Exception {
//        System.out.println("Hello World from Command Line Runner");
//    }
//}

