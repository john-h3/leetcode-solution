package easy.array.pairsofsongswithtotaldurationsdivisibleby60;

/**
 * PairsOfSongsWithTotalDurationsDivisibleBy60
 *
 * @author john 2020/6/12
 */
public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    class Solution {
        public int numPairsDivisibleBy60(int[] time) {
            int[] map = new int[501];
            for (int t : time) {
                map[t]++;
            }
            int count = 0;
            for (int i = 0; i < map.length; i++) {
                if (map[i] == 0) {
                    continue;
                }
                for (int j = i / 60 + 1; j <= 16; j++) {
                    int diff = j * 60 - i;
                    if (diff <= 500 && map[diff] > 0) {
                        if (diff == i) {
                            if (map[i] > 1) {
                                count += map[i] * (map[i] - 1);
                            }
                        } else {
                            count += map[i] * map[diff];
                        }
                    }
                }
            }
            return count / 2;
        }
    }
}