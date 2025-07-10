package com.udemy.in28minutes.springframeworkmasterclass;

import com.udemy.in28minutes.springframeworkmasterclass.service.search.BinarySearch;
import com.udemy.in28minutes.springframeworkmasterclass.service.search.LinearSearch;
import com.udemy.in28minutes.springframeworkmasterclass.service.search.SearchAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
  
  private static Logger logger = LoggerFactory.getLogger(Application.class);
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        SpringApplication.run(Application.class, args);
    
    // search using BinarySearch algorithm
    SearchAlgorithm searchAlgorithm = applicationContext.getBean(BinarySearch.class);
    int result = searchAlgorithm.search(new int[] {12, 10, -1, 3, 20}, 12);
    logger.info("{}", "Using BinarySearch: " + result);
    
    // search using LinearSearch algorithm
    searchAlgorithm = applicationContext.getBean(LinearSearch.class);
    result = searchAlgorithm.search(new int[] {12, 10, -1, 3, 20}, 12);
    logger.info("{}", "Using LinearSearch: " + result);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
