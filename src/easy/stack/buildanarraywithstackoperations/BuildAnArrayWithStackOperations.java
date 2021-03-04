package easy.stack.buildanarraywithstackoperations;

import java.util.ArrayList;
import java.util.List;

/**
 * BuildAnArrayWithStackOperations
 *
 * @author john 2021/3/4
 */
public class BuildAnArrayWithStackOperations {
  class Solution {
    public List<String> buildArray(int[] target, int n) {
      var ans = new ArrayList<String>();
      n = 1;
      for (int num : target) {
        for (; n < num; n++) {
          ans.add("Push");
          ans.add("Pop");
        }
        ans.add("Push");
        n++;
      }
      return ans;
    }
  }
}
