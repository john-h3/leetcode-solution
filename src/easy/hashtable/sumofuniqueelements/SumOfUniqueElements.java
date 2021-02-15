package easy.hashtable.sumofuniqueelements;
/**
 * SumOfUniqueElements
 *
 * @author john 2021/2/15
 */
public class SumOfUniqueElements {
  class Solution {
    public int sumOfUnique(int[] nums) {
      var table = new int[101];
      for (int num : nums) {
        table[num]++;
      }
      var sum = 0;
      for (int i = 0; i < table.length; i++) {
        if (table[i] == 1) sum += i;
      }
      return sum;
    }
  }
}
