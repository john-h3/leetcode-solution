package easy.array.rotatearray;

/**
 * RotateArray
 *
 * @author john 2020/5/7
 */
public class RotateArray {
    class Solution {
        public void rotate(int[] nums, int k) {
            k %= nums.length;
            int startIdx = 0;
            for (int count = 0; count < nums.length; startIdx++) {
                int fromIdx = startIdx;
                int fromValue = nums[fromIdx];
                do {
                    int toIdx = (fromIdx + k) % nums.length;
                    int temp = nums[toIdx];
                    nums[toIdx] = fromValue;
                    fromValue = temp;
                    fromIdx = toIdx;
                    count++;
                } while (fromIdx != startIdx);
            }
        }
    }
}
