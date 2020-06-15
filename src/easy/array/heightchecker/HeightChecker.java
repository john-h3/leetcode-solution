package easy.array.heightchecker;

import java.util.Arrays;

/**
 * HeightChecker
 * 
 * @author john 2020/6/15
 */
public class HeightChecker {
    class Solution {
        public int heightChecker(int[] heights) {
            int count = 0;
            int[] newH = new int[heights.length];
            System.arraycopy(heights, 0, newH, 0, heights.length);
            Arrays.sort(newH);
            for (int i = 0; i < heights.length; i++) {
                if (heights[i] != newH[i]) {
                    count++;
                }
            }
            return count;
        }
    }
}