package easy.array.countlargestgroup;

import java.util.Arrays;

/**
 * CountLargestGroup
 * 
 * @author john 2020/8/6
 */
public class CountLargestGroup {
    class Solution {
        public int countLargestGroup(int n) {
            int[] hash = new int[37];
            for (int i = 1; i <= n; i++) {
                int tmp = i;
                int sum = 0;
                while (tmp > 0) {
                    sum += tmp % 10;
                    tmp /= 10;
                }
                hash[sum]++;
            }
            int max = hash[0];
            int count = 0;
            for (int c : hash) {
                if (max == c) {
                    count++;
                } else if (c > max) {
                    max = c;
                    count = 1;
                }
            }
            return count;
        }
    }
}