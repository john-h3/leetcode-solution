package easy.array.zaipaixushuzuzhongchazhaoshuzilcof;

import java.util.Arrays;

/**
 * ZaiPaiXuShuZuZhongChaZhaoShuZiLcof
 *
 * @author john 2020/8/7
 */
public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof {
    class Solution {
        public int search(int[] nums, int target) {
            if (nums.length != 0 && target >= nums[0] && target <= nums[nums.length - 1]) {
                int startIdx = Arrays.binarySearch(nums, target);
                if (startIdx >= 0) {
                    int count = 1;
                    for (int i = startIdx + 1; i < nums.length; i++) {
                        if (nums[i] == target) {
                            count++;
                        } else {
                            break;
                        }
                    }
                    for (int i = startIdx - 1; i >= 0; i--) {
                        if (nums[i] == target) {
                            count++;
                        } else {
                            break;
                        }
                    }
                    return count;
                }
            }
            return 0;
        }
    }
}