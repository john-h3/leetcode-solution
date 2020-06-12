package easy.array.findcommoncharacters;

import java.util.*;

/**
 * FindCommonCharacters
 *
 * @author john 2020/6/11
 */
public class FindCommonCharacters {
    class Solution {
        final String[] table = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        public List<String> commonChars(String[] A) {
            int[] map = new int[26];
            Arrays.fill(map, 100);
            for (String s : A) {
                int[] tMap = new int[26];
                for (char c : s.toCharArray()) {
                    tMap[c - 97]++;
                }
                for (int i = 0; i < map.length; i++) {
                    map[i] = Math.min(tMap[i], map[i]);
                }
            }
            List<String> result = new ArrayList<>();
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i]; j++) {
                    result.add(table[i]);
                }
            }
            return result;
        }
    }
}