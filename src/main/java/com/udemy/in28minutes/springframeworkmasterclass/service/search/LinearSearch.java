package com.udemy.in28minutes.springframeworkmasterclass.service.search;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@Component
public class LinearSearch implements SearchAlgorithmImpl {

  private final String NAME = this.getClass().getName();

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
