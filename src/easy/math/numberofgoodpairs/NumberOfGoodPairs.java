package easy.math.numberofgoodpairs;

import java.util.Arrays;

/**
 * NumberOfGoodPairs
 * 
 * @author john 2021/1/21
 */
public class NumberOfGoodPairs {
  class Solution {
    public int numIdenticalPairs(int[] nums) {
      int result = 0;
      var table = new int[101];
      Arrays.stream(nums).forEach(e->table[e]++);
      for (int c : table) {
        result += c * (c - 1) / 2;
      }
      return result;
    }
  }
}