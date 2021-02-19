package easy.greedy.minimumsubsequenceinnonincreasingorder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * MinimumSubsequenceInNonIncreasingOrder
 *
 * @author john 2021/2/19
 */
public class MinimumSubsequenceInNonIncreasingOrder {
  class Solution {
    public List<Integer> minSubsequence(int[] nums) {
      Arrays.sort(nums);
      var sum = Arrays.stream(nums).sum();
      var list = new ArrayList<Integer>();
      var liSum = 0;
      for (int i = nums.length - 1; i >= 0 && liSum <= sum / 2; i--) {
        list.add(nums[i]);
        liSum += nums[i];
      }
      return list;
    }
  }
}