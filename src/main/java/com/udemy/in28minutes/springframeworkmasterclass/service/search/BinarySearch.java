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
public class BinarySearch implements SearchAlgorithm {
  
  @Autowired
  @Qualifier("selection")
  private SortAlgorithm sortAlgorithm;
  private final String NAME = this.getClass().getName();
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public BinarySearch() { }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public BinarySearch(SortAlgorithm sortAlgorithm) {
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
