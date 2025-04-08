package com.udemy.in28minutes.springframeworkmasterclass;

import com.udemy.in28minutes.springframeworkmasterclass.service.search.BinarySearch;
//import com.udemy.in28minutes.springframeworkmasterclass.service.search.LinearSearch;
import com.udemy.in28minutes.springframeworkmasterclass.service.search.SearchAlgorithmImpl;
//import com.udemy.in28minutes.springframeworkmasterclass.service.sort.BubbleSort;
//import com.udemy.in28minutes.springframeworkmasterclass.service.sort.SelectionSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.udemy.in28minutes.springframeworkmasterclass.service.search")
//@ComponentScan("com.udemy.in28minutes.springframeworkmasterclass.service.sort")
//@ComponentScan("com.udemy.in28minutes.springframeworkmasterclass.service.sort")
public class SpringFrameworkMasterclassApplication {

    public static void main(String[] args) {
//        SearchAlgorithmImpl searchAlgorithm = new BinarySearch();
//        ((BinarySearch) searchAlgorithm).setSortAlgorithm(new SelectionSort());
        
        ApplicationContext applicationContext =
            SpringApplication.run(SpringFrameworkMasterclassApplication.class, args);
        SearchAlgorithmImpl searchAlgorithm =
            (BinarySearch)applicationContext.getBean(BinarySearch.class);
            //(LinearSearch)applicationContext.getBean(LinearSearch.class);
        
        int result = searchAlgorithm.search(new int[] {12, 10, -1, 3, 20}, 12);
        System.out.println(result);
    }

}
