package easy.array.maxconsecutiveones;
/**
 * MaxConsecutiveOnes
 * 
 * @author john 2020/5/25
 */
public class MaxConsecutiveOnes {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            int count = 0;
            for (int num : nums) {
                if (num == 1) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }
            max = Math.max(max, count);
            return max;
        }
    }
}