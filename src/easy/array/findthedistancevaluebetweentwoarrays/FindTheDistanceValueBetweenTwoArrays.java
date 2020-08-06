package easy.array.findthedistancevaluebetweentwoarrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * FindTheDistanceValueBetweenTwoArrays
 *
 * @author john 2020/8/6
 */
public class FindTheDistanceValueBetweenTwoArrays {
    class Solution {
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            int count = 0;
            Arrays.sort(arr2);
            boolean[] cache = new boolean[2001];
            for (int i = 0; i < arr2.length - 1; i++) {
                if (arr2[i + 1] - arr2[i] > d * 2) {
                    for (int j = arr2[i] + d + 1; j < arr2[i + 1] - d; j++) {
                        cache[j + 1000] = true;
                    }
                }
            }
            int min = arr2[0];
            int max = arr2[arr2.length - 1];
            for (int i : arr1) {
                if (i < min) {
                    if (min - i > d) {
                        count++;
                    }
                } else if (i > max) {
                    if (i - max > d) {
                        count++;
                    }
                } else {
                    if (cache[i + 1000]) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}