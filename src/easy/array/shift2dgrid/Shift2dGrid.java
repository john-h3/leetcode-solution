package easy.array.shift2dgrid;

import java.util.ArrayList;
import java.util.List;

/**
 * Shift2dGrid
 * 
 * @author john 2020/8/3
 */
public class Shift2dGrid {
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            int[] arr = new int[grid.length * grid[0].length];
            int idx = 0;
            for (int[] ints : grid) {
                for (int anInt : ints) {
                    arr[idx++] = anInt;
                }
            }
            int offset = arr.length - k % arr.length;
            List<List<Integer>> answer = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                List<Integer> li = new ArrayList<>();
                for (int j = 0; j < grid[0].length; j++) {
                    li.add(arr[offset++ % (arr.length)]);
                }
                answer.add(li);
            }
            return answer;
        }
    }
}