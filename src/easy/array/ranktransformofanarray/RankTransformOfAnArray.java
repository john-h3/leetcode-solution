package easy.array.ranktransformofanarray;

import java.util.*;

/**
 * RankTransformOfAnArray
 * 
 * @author john 2020/8/4
 */
public class RankTransformOfAnArray {
    class Solution {
        public int[] arrayRankTransform(int[] arr) {
            int[] tmpArr = new int[arr.length];
            System.arraycopy(arr, 0, tmpArr, 0, arr.length);
            Arrays.sort(tmpArr);
            Map<Integer, Integer> map = new HashMap<>();
            int idx = 1;
            for (int j : tmpArr) {
                if (!map.containsKey(j)) {
                    map.put(j, idx++);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = map.get(arr[i]);
            }
            return arr;
        }
    }
}