package easy.array.createtargetarrayinthegivenorder;

import java.util.*;

/**
 * CreateTargetArrayInTheGivenOrder
 * 
 * @author john 2020/8/6
 */
public class CreateTargetArrayInTheGivenOrder {
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            int[] target = new int[nums.length];
            for (int i = 0; i < target.length; i++) {
                int idx = index[i];
                System.arraycopy(target, idx, target, idx + 1, target.length - 1 - idx);
                target[idx] = nums[i];
            }
            return target;
        }
    }
}