package easy.array.runningsumof1darray;
/**
 * RunningSumOf1dArray
 * 
 * @author john 2020/8/6
 */
public class RunningSumOf1dArray {
    class Solution {
        public int[] runningSum(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
            }
            return nums;
        }
    }
}