package easy.string.maximumscoreaftersplittingastring;

/**
 * MaximumScoreAfterSplittingAString
 * 
 * @author john 2020/8/17
 */
public class MaximumScoreAfterSplittingAString {
    class Solution {
        public int maxScore(String s) {
            char[] chars = s.toCharArray();
            int leftScore = chars[0] == '0' ? 1 : 0;
            int rightScore = 0;
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == '1') {
                    rightScore++;
                }
            }
            int maxScore = leftScore + rightScore;
            for (int i = 1; i < chars.length - 1; i++) {
                if (chars[i] == '0') {
                    leftScore++;
                } else {
                    rightScore--;
                }
                maxScore = Math.max(maxScore, leftScore + rightScore);
            }
            return maxScore;
        }
    }
}