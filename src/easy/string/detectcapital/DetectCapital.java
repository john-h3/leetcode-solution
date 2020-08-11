package easy.string.detectcapital;

/**
 * DetectCapital
 *
 * @author john 2020/8/11
 */
public class DetectCapital {
    class Solution {
        public boolean detectCapitalUse(String word) {
            if (word.length() != 1) {
                char[] chars = word.toCharArray();
                if (chars[0] >= 'a' && chars[0] <= 'z') {
                    for (int i = 1; i < chars.length; i++) {
                        if (chars[i] < 'a' || chars[i] > 'z') {
                            return false;
                        }
                    }
                } else if (chars[1] >= 'a' && chars[1] <= 'z') {
                    for (int i = 2; i < chars.length; i++) {
                        if (chars[i] < 'a' || chars[i] > 'z') {
                            return false;
                        }
                    }
                } else {
                    for (int i = 2; i < chars.length; i++) {
                        if (chars[i] < 'A' || chars[i] > 'Z') {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}