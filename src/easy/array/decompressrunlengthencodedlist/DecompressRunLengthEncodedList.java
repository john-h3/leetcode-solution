package easy.array.decompressrunlengthencodedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * DecompressRunLengthEncodedList
 *
 * @author john 2020/8/4
 */
public class DecompressRunLengthEncodedList {
    class Solution {
        public int[] decompressRLElist(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i += 2) {
                count += nums[i];
            }
            int[] answer = new int[count];
            int idx = 0;
            for (int i = 0; i < nums.length; i += 2) {
                int freq = nums[i];
                int val = nums[i + 1];
                for (int j = 0; j < freq; j++) {
                    answer[idx++] = val;
                }
            }
            return answer;
        }
    }
}