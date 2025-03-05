package com.udemy.in28minutes.springframeworkmasterclass.service.sort;

import org.springframework.stereotype.Component;

@Component
public interface SortAlgorithmImpl {
  
  public int[] sort(int[] array);
  
}
