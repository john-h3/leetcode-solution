package easy.array.playwithchips;
/**
 * PlayWithChips
 * 
 * @author john 2020/8/2
 */
public class PlayWithChips {
    class Solution {
        public int minCostToMoveChips(int[] chips) {
            int odd = 0, even = 0;
            for (int chip : chips) {
                if ((chip & 1) == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            return Math.min(odd, even);
        }
    }
}