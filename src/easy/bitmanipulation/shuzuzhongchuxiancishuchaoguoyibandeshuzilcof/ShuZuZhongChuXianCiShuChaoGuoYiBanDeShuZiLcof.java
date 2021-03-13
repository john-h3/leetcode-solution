package easy.bitmanipulation.shuzuzhongchuxiancishuchaoguoyibandeshuzilcof;
/**
 * ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof
 *
 * @author john 2021/3/13
 */
public class ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof {
  class Solution {
    public int majorityElement(int[] nums) {
      var candidate = 0;
      var count = 0;
      for (int num : nums) {
        if (count == 0) {
          candidate = num;
        }
        count += candidate == num ? 1 : -1;
      }
      return candidate;
    }
  }
}
