package easy.array.canmakearithmeticprogressionfromsequence;

import java.util.Arrays;

/**
 * CanMakeArithmeticProgressionFromSequence
 *
 * @author john 2020/8/7
 */
public class CanMakeArithmeticProgressionFromSequence {
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            Arrays.sort(arr);
            int d = arr[1] - arr[0];
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] - arr[i - 1] != d) {
                    return false;
                }
            }
            return true;
        }
    }
}