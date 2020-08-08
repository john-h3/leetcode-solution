package easy.array.countandsay;

/**
 * CountAndSay
 * 
 * @author john 2020/8/8
 */
public class CountAndSay {
    class Solution {
        public String countAndSay(int n) {
            if (n == 1) {
                return "1";
            } else {
                StringBuilder builder = new StringBuilder();
                String s = countAndSay(n - 1);
                int c = 1;
                char ch = s.charAt(0);
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i) == ch) {
                        c++;
                    } else {
                        builder.append(c).append(ch);
                        c = 1;
                        ch = s.charAt(i);
                    }
                }
                builder.append(c).append(ch);
                return builder.toString();
            }
        }
    }
}