package easy.array.degreeofanarray;

import java.util.*;
import java.util.stream.Collectors;

/**
 * DegreeOfAnArray
 * 
 * @author john 2020/6/2
 */
public class DegreeOfAnArray {
    class Solution {
        public int findShortestSubArray(int[] nums) {
            Map<Integer, Integer> countMap = new HashMap<>();
            Map<Integer, Integer> firstIdxMap = new HashMap<>();
            Map<Integer, Integer> lastIdxMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                countMap.merge(num, 1, Integer::sum);
                firstIdxMap.putIfAbsent(num, i);
                lastIdxMap.put(num, i);
            }
            int maxCount = Collections.max(countMap.values());
            int shortestLength = nums.length;
            for (Integer num : countMap.keySet()) {
                int count = countMap.get(num);
                if (count == maxCount) {
                    shortestLength = Math.min(shortestLength, lastIdxMap.get(num) - firstIdxMap.get(num) + 1);
                }
            }
            return shortestLength;
        }
    }
}