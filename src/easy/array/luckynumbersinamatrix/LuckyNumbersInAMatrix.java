package easy.array.luckynumbersinamatrix;

import java.util.*;

/**
 * LuckyNumbersInAMatrix
 * 
 * @author john 2020/8/6
 */
public class LuckyNumbersInAMatrix {
    class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            List<Integer> answer = new ArrayList<>();
            outer: for (int[] row : matrix) {
                int minIdx = 0;
                for (int i = 1; i < row.length; i++) {
                    if (row[minIdx] > row[i]) {
                        minIdx = i;
                    }
                }
                for (int[] ints : matrix) {
                    if (ints[minIdx] > row[minIdx]) {
                        continue outer;
                    }
                }
                answer.add(row[minIdx]);
            }
            return answer;
        }
    }
}