package com.udemy.in28minutes.springframeworkmasterclass;

import com.udemy.in28minutes.springframeworkmasterclass.service.properties.SomeExternalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkMasterclassExternalServiceApplication {
  
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        SpringApplication.run(SpringFrameworkMasterclassExternalServiceApplication.class, args);
    
    SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
    System.out.println(someExternalService.getUrl());
  }

}
