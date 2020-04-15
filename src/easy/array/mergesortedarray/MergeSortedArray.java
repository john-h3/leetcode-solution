package easy.array.mergesortedarray;

import java.util.Arrays;

/**
 * MergeSortedArray
 * 
 * @author john 2020/4/15
 */
public class MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] temp = new int[m + n];
            for (int i = 0, j = 0, k = 0; i < temp.length; i++) {
                if (j == m) {
                    temp[i] = nums2[k++];
                }
                else if (k == n) {
                    temp[i] = nums1[j++];
                }
                else if (nums1[j] < nums2[k]) {
                    temp[i] = nums1[j++];
                } else {
                    temp[i] = nums2[k++];
                }
            }
            if (temp.length >= 0) {
                System.arraycopy(temp, 0, nums1, 0, temp.length);
            }
        }
    }
}