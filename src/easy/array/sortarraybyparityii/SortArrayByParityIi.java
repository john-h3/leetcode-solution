package easy.array.sortarraybyparityii;
/**
 * SortArrayByParityIi
 * 
 * @author john 2020/6/9
 */
public class SortArrayByParityIi {
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            int[] newArr = new int[A.length];
            int idx1 = 0;
            int idx2 = 1;
            for (int v : A) {
                if ((v & 1) == 0) {
                    newArr[idx1] = v;
                    idx1 += 2;
                } else {
                    newArr[idx2] = v;
                    idx2 += 2;
                }
            }
            return newArr;
        }
    }
}