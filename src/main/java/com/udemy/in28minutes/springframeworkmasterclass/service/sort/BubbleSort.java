package com.udemy.in28minutes.springframeworkmasterclass.service.sort;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BubbleSort implements SortAlgorithmImpl {
  
  /* sort in ascending order */
  @Override
  public int[] sort(int[] array) {
    if (array == null || array.length == 0) return null;
    
    int[] sortedArray = new int[array.length];
    System.arraycopy(array, 0, sortedArray, 0, array.length);
    
    int temp;
    boolean swapped;
    for (int i = 0; i < sortedArray.length - 1; i++) {
      swapped = false;
      for (int j = 0; j < sortedArray.length - i - 1; j++) {
        if (sortedArray[j] > sortedArray[j + 1]) {
          temp = sortedArray[j];
          sortedArray[j] = sortedArray[j + 1];
          sortedArray[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) break;
    }
    return sortedArray;
  }

  //-------------------------------------------------------------------------------------------------------------------
  
}
