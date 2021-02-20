package easy.greedy.maximumunitsonatruck;

import java.util.Arrays;
import java.util.Comparator;

/**
 * MaximumUnitsOnATruck
 *
 * @author john 2021/2/20
 */
public class MaximumUnitsOnATruck {
  class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
      var table = new int[1001];
      for (int[] boxType : boxTypes) {
        table[boxType[1]] += boxType[0];
      }
      var unitSum = 0;
      for (int i = table.length - 1; i >= 0; i--) {
        if (table[i] > 0) {
          if (truckSize <= table[i]) {
            unitSum += i * truckSize;
            break;
          } else {
            unitSum += i * table[i];
            truckSize -= table[i];
          }
        }
      }
      return unitSum;
    }
  }
}