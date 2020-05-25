package easy.array.arraypartitioni;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * ArrayPartitionI
 *
 * @author john 2020/5/25
 */
public class ArrayPartitionI {
    class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            boolean b = true;
            int sum = 0;
            for (int num : nums) {
                if (b) {
                    sum += num;
                }
                b = !b;

            }
            return sum;
        }
    }
}