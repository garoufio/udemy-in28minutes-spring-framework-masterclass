package com.udemy.in28minutes.springframeworkmasterclass.service.search;

import com.udemy.in28minutes.springframeworkmasterclass.service.sort.SortAlgorithmImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class BinarySearch implements SearchAlgorithmImpl {

  private final String NAME = this.getClass().getName();

  @Autowired
  private SortAlgorithmImpl sortAlgorithm;

  //-------------------------------------------------------------------------------------------------------------------
  
  @Override
  public int search(int[] array, int target) {
    if (array == null || array.length == 0) {
      System.out.printf("[%s] Array is null or empty\n", NAME.substring(NAME.lastIndexOf('.') + 1));
      return -1;
    }
    if (sortAlgorithm == null) {
      System.out.printf("[%s] SortAlgorithm is null", NAME.substring(NAME.lastIndexOf('.') + 1));
      return -1;
    }
    
    int[] sortedArray = sortAlgorithm.sort(array);
    if (sortedArray == null) return -1;
    
    int low = 0;
    int high = sortedArray.length - 1;
    int mid;
    while (low <= high) {
      mid = (high + low) / 2;
      
      if (target > sortedArray[mid]) {
        low = mid + 1;
      }
      else if (target < sortedArray[mid]) {
        high = mid - 1;
      }
      else {
        return mid;
      }
    }
    return -low - 1;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
