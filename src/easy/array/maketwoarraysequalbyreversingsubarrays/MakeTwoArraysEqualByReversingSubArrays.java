package easy.array.maketwoarraysequalbyreversingsubarrays;

import java.util.Arrays;

/**
 * MakeTwoArraysEqualByReversingSubArrays
 *
 * @author john 2020/8/6
 */
public class MakeTwoArraysEqualByReversingSubArrays {
    class Solution {
        public boolean canBeEqual(int[] target, int[] arr) {
            int[] hash = new int[1001];
            for (int i : target) {
                hash[i]++;
            }
            for (int i : arr) {
                hash[i]++;
            }
            for (int i : hash) {
                if ((i & 1) == 1) {
                    return false;
                }
            }
            return true;
        }
    }
}