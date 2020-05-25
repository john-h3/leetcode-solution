package easy.array.findallnumbersdisappearedinanarray;

import java.util.ArrayList;
import java.util.List;

/**
 * FindAllNumbersDisappearedInAnArray
 *
 * @author john 2020/5/18
 */
public class FindAllNumbersDisappearedInAnArray {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            for (int num : nums) {
                int temp = num;
                while (temp > 0) {
                    int idx = temp - 1;
                    temp = nums[idx];
                    nums[idx] = -1;
                }
            }
            List<Integer> disappearedNumbers = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    disappearedNumbers.add(i + 1);
                }
            }
            return disappearedNumbers;
        }
    }
}