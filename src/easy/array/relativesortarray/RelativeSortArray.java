package easy.array.relativesortarray;
/**
 * RelativeSortArray
 * 
 * @author john 2020/6/19
 */
public class RelativeSortArray {
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int[] map = new int[1001];
            for (int k : arr1) {
                map[k]++;
            }
            int idx = 0;
            for (int k : arr2) {
                while (map[k]-- > 0) {
                    arr1[idx++] = k;
                }
            }
            for (int i = 0; i < map.length; i++) {
                while (map[i]-- > 0) {
                    arr1[idx++] = i;
                }
            }
            return arr1;
        }
    }
}