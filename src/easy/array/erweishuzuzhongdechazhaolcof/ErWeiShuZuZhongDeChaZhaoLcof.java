package easy.array.erweishuzuzhongdechazhaolcof;
/**
 * ErWeiShuZuZhongDeChaZhaoLcof
 * 
 * @author john 2020/8/7
 */
public class ErWeiShuZuZhongDeChaZhaoLcof {
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            for (int[] row : matrix) {
                for (int i : row) {
                    if (i == target) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}