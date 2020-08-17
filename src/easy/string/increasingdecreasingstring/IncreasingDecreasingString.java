package easy.string.increasingdecreasingstring;

/**
 * IncreasingDecreasingString
 * 
 * @author john 2020/8/17
 */
public class IncreasingDecreasingString {
    class Solution {
        public String sortString(String s) {
            char[] chars = s.toCharArray();
            int[] counter = new int[26];
            for (char c : chars) {
                counter[c - 'a']++;
            }
            int idx = 0;
            boolean done = false;
            while (!done) {
                done = true;
                for (int i = 0; i < counter.length; i++) {
                    if (counter[i]-- > 0) {
                        chars[idx++] = (char) ('a' + i);
                        if (counter[i] > 0) {
                            done = false;
                        }
                    }
                }
                if (!done) {
                    done = true;
                    for (int i = counter.length - 1; i >= 0; i--) {
                        if (counter[i]-- > 0) {
                            chars[idx++] = (char) ('a' + i);
                            if (counter[i] > 0) {
                                done = false;
                            }
                        }
                    }
                }
            }
            return new String(chars);
        }
    }
}