package com.udemy.in28minutes.springframeworkmasterclass.service.search;

import com.udemy.in28minutes.springframeworkmasterclass.service.sort.SortAlgorithm;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class LinearSearch implements SearchAlgorithm {
  
  @Autowired
  @Qualifier("bubble")
  private SortAlgorithm sortAlgorithm;
  private final String NAME = this.getClass().getName();
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public LinearSearch() {  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public LinearSearch(SortAlgorithm sortAlgorithm) {
    this.sortAlgorithm = sortAlgorithm;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @Override
  public int search(int[] array, int target) {
    if (array == null || array.length == 0) {
      System.out.printf("[%s] Array is null or empty\n", NAME.substring(NAME.lastIndexOf('.') + 1));
      return -1;
    }
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) return i;
    }
    return -1;
  }
  
  //-------------------------------------------------------------------------------------------------------------------

}
