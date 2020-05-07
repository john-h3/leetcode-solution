package easy.array.majorityelement;

/**
 * MajorityElement
 *
 * @author john 2020/4/29
 */
public class MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            int majority = nums[0];
            int count = 1;
            for (int i = 1; i < nums.length; i++) {
                if (count > 0) {
                    if (nums[i] != majority) {
                        count--;
                    } else {
                        count++;
                    }
                } else {
                    majority = nums[i];
                    count++;
                }
            }
            return majority;
        }
    }
}