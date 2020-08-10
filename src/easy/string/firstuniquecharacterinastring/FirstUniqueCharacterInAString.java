package easy.string.firstuniquecharacterinastring;

import java.util.*;

/**
 * FirstUniqueCharacterInAString
 * 
 * @author john 2020/8/10
 */
public class FirstUniqueCharacterInAString {
    class Solution {
        public int firstUniqChar(String s) {
            char[] chars = s.toCharArray();
            int[] hash = new int[26];
            for (char c : chars) {
                hash[c-'a']++;
            }
            for (int i = 0; i < chars.length; i++) {
                if (hash[chars[i] - 'a'] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
}