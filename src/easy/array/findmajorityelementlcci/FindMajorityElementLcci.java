package easy.array.findmajorityelementlcci;

/**
 * FindMajorityElementLcci
 *
 * @author john 2020/8/8
 */
public class FindMajorityElementLcci {
    class Solution {
        public int majorityElement(int[] nums) {
            int major = nums[0];
            int count = 0;
            for (int num : nums) {
                if (major == num) {
                    count++;
                } else {
                    count--;
                    if (count < 0) {
                        major = num;
                        count = 1;
                    }
                }
            }
            if (count > 0) {
                int c = 0;
                for (int num : nums) {
                    if (num == major) {
                        c++;
                    }
                }
                return c > nums.length / 2 ? major : -1;
            } else {
                return -1;
            }
        }
    }
}