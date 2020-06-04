package easy.array.positionsoflargegroups;

import java.util.ArrayList;
import java.util.List;

/**
 * PositionsOfLargeGroups
 *
 * @author john 2020/6/4
 */
public class PositionsOfLargeGroups {
    class Solution {
        public List<List<Integer>> largeGroupPositions(String S) {
            List<List<Integer>> result = new ArrayList<>();
            int startIdx = 0;
            char ch = S.charAt(0);
            for (int i = 1; i < S.length(); i++) {
                char c = S.charAt(i);
                if (ch != c) {
                    if (i - startIdx >= 3) {
                        List<Integer> range = new ArrayList<>(2);
                        range.add(startIdx);
                        range.add(i - 1);
                        result.add(range);
                    }
                    startIdx = i;
                    ch = c;
                }
            }
            if (S.length() - startIdx >= 3) {
                List<Integer> range = new ArrayList<>(2);
                range.add(startIdx);
                range.add(S.length() - 1);
                result.add(range);
            }
            return result;
        }
    }
}