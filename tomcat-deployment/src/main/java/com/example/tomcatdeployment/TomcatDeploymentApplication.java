package com.example.tomcatdeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TomcatDeploymentApplication extends SpringBootServletInitializer {
    // to sp war file deployment: extend SBSI
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TomcatDeploymentApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TomcatDeploymentApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World from Tomcat";
    }
}
