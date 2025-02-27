package com.udemy.in28minutes.springframeworkmasterclass;

import com.udemy.in28minutes.springframeworkmasterclass.service.search.BinarySearch;
import com.udemy.in28minutes.springframeworkmasterclass.service.search.LinearSearch;
import com.udemy.in28minutes.springframeworkmasterclass.service.search.SearchAlgorithmImpl;
import com.udemy.in28minutes.springframeworkmasterclass.service.sort.BubbleSort;
import com.udemy.in28minutes.springframeworkmasterclass.service.sort.SelectionSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringFrameworkMasterclassApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringFrameworkMasterclassApplication.class, args);
        
        SearchAlgorithmImpl searchAlgorithm = new BinarySearch();
        
        //System.out.println(Arrays.toString((new BubbleSort()).sort(new int[] {12, 10, -1, 3, 20})));
        
        ((BinarySearch) searchAlgorithm).setSortAlgorithm(new BubbleSort());
        int result = searchAlgorithm.search(new int[] {12, 10, -1, 3, 20}, 3);
        System.out.println(result);
    }

}
