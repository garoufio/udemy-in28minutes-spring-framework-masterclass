package com.udemy.in28minutes.springframeworkmasterclass.service.sort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("selection") // Primary annotation is preferred over the autowiring by name or by @Qualifier
public class SelectionSort implements SortAlgorithm {
  
  /* sort in ascending order */
  @Override
  public int[] sort(int[] array) {
    if (array == null || array.length == 0) return null;
    
    int[] sortedArray = new int[array.length];
    System.arraycopy(array, 0, sortedArray, 0, array.length);
    
    int currentMin;
    int currentMinIndex;
    for (int i = 0; i < sortedArray.length - 1; i++) {
      currentMin = sortedArray[i];
      currentMinIndex = i;
      
      for (int j = i + 1; j < sortedArray.length; j++) {
        if (sortedArray[j] < currentMin) {
          currentMin = sortedArray[j];
          currentMinIndex = j;
        }
      }
      
      if (currentMinIndex != i) {
        sortedArray[currentMinIndex] = sortedArray[i];
        sortedArray[i] = currentMin;
      }
    }
    return sortedArray;
  }

  //-------------------------------------------------------------------------------------------------------------------
  
}
