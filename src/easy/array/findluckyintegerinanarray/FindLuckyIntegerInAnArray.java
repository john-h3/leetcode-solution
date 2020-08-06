package easy.array.findluckyintegerinanarray;

import java.util.Arrays;

/**
 * FindLuckyIntegerInAnArray
 * 
 * @author john 2020/8/6
 */
public class FindLuckyIntegerInAnArray {
    class Solution {
        public int findLucky(int[] arr) {
            int[] hash = new int[501];
            for (int i : arr) {
                hash[i]++;
            }
            for (int i = hash.length - 1; i > 0; i--) {
                if (hash[i] == i) {
                    return i;
                }
            }
            return -1;
        }
    }
}