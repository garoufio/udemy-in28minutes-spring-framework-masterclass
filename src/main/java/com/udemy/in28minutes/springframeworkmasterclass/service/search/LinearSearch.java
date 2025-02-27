package com.udemy.in28minutes.springframeworkmasterclass.service.search;

import com.udemy.in28minutes.springframeworkmasterclass.service.sort.SortAlgorithmImpl;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinearSearch implements SearchAlgorithmImpl {
  
  private SortAlgorithmImpl sortAlgorithm;
  private final String NAME = this.getClass().getName();
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public LinearSearch() {  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public LinearSearch(SortAlgorithmImpl sortAlgorithm) {
    this.sortAlgorithm = sortAlgorithm;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Override
  public int search(int[] array, int target) {
    if (array == null || array.length == 0) {
      System.out.printf("[%s] Array is null or empty\n", NAME.substring(NAME.lastIndexOf('.') + 1));
      return -1;
    }
    else if (sortAlgorithm == null) {
      System.out.printf("[%s] SortAlgorithm is null\n", NAME.substring(NAME.lastIndexOf('.') + 1));
      return -1;
    }
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) return i;
    }
    return -1;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
