package easy.array.missingnumberlcci;

/**
 * MissingNumberLcci
 * 
 * @author john 2020/8/8
 */
public class MissingNumberLcci {
    class Solution {
        public int missingNumber(int[] nums) {
            boolean[] hash = new boolean[nums.length + 1];
            for (int num : nums) {
                hash[num] = true;
            }
            for (int i = 0; i < hash.length; i++) {
                if (!hash[i]) {
                    return i;
                }
            }
            return -1;
        }
    }
}