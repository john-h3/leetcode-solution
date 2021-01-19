package easy.math.distributecandiestopeople;

import java.util.ArrayList;

/**
 * DistributeCandiesToPeople
 * 
 * @author john 2021/1/19
 */
public class DistributeCandiesToPeople {
  class Solution {
    public int[] distributeCandies(int candies, int num_people) {
      var result = new int[num_people];
      var l = ((int) Math.floor(Math.sqrt(0.25+2*candies)-0.5)) / num_people;
      int sum = 0;
      for (int i = 0; i < num_people; i++) {
        sum += result[i] = (i + 1 + (l-1) * num_people + (i + 1)) * l / 2;
      }
      int left = candies - sum;
      int start = l  * num_people + 1;
      int i = 0;
      while (left > 0) {
        result[i++] += Math.min(start, left);
        left -= start++;
      }
      return result;
    }
  }
}