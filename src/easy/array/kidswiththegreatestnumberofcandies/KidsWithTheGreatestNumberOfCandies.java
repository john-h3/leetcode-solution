package easy.array.kidswiththegreatestnumberofcandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * KidsWithTheGreatestNumberOfCandies
 *
 * @author john 2020/8/6
 */
public class KidsWithTheGreatestNumberOfCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> answer = new ArrayList<>(candies.length);
            int max = candies[0];
            for (int n : candies) {
                max = Math.max(n, max);
            }
            for (int n : candies) {
                answer.add(n + extraCandies >= max);
            }
            return answer;
        }
    }
}