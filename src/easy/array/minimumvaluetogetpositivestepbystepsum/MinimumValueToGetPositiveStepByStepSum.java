package easy.array.minimumvaluetogetpositivestepbystepsum;
/**
 * MinimumValueToGetPositiveStepByStepSum
 * 
 * @author john 2020/8/6
 */
public class MinimumValueToGetPositiveStepByStepSum {
    class Solution {
        public int minStartValue(int[] nums) {
            int sum = 0;
            int min = nums[0];
            for (int num : nums) {
                sum += num;
                min = Math.min(min, sum);
            }
            if (min >= 0) {
                return 1;
            } else {
                return 1 - min;
            }
        }
    }
}