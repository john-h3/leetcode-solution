package easy.array.minimumabsolutedifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * MinimumAbsoluteDifference
 *
 * @author john 2020/8/2
 */
public class MinimumAbsoluteDifference {
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            List<List<Integer>> answer = new ArrayList<>();
            int min = arr[1] - arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                int t = arr[i + 1] - arr[i];
                if (t <= min) {
                    if (t < min) {
                        min = t;
                        answer.clear();
                    }
                    answer.add(Arrays.asList(arr[i], arr[i + 1]));
                }
            }
            return answer;
        }
    }
}