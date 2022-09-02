package daily._202208._20220825;

import java.util.Arrays;
import java.util.List;

/**
 * @author John.h3
 * created on 2022/8/25
 */
public class Daily {
    class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            var r = Arrays.binarySearch(arr, x);
            if (r < 0) {
                r = -(r + 1);
            }
            if (r < 0) {
                r++;
            } else if (r == arr.length) {
                r--;
            }
            var l = r - 1;
            while (r - 1 - l != k) {
                if (r < arr.length && l >= 0) {
                    if (Math.abs(arr[r] - x) < Math.abs(arr[l] - x) || (arr[r] - x == x - arr[l] && arr[r] < arr[l])) {
                        r++;
                    } else {
                        l--;
                    }
                } else if (l < 0) {
                    r++;
                } else {
                    l--;
                }
            }
            return Arrays.stream(arr, l + 1, r).boxed().toList();
        }
    }
}
