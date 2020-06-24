package easy.array.findwordsthatcanbeformedbycharacters;

/**
 * FindWordsThatCanBeFormedByCharacters
 *
 * @author john 2020/6/19
 */
public class FindWordsThatCanBeFormedByCharacters {
    class Solution {
        public int countCharacters(String[] words, String chars) {
            int count = 0;
            int[] charMap = new int[26];
            for (int i = 0; i < chars.length(); i++) {
                charMap[chars.charAt(i) - 'a']++;
            }
            for (String word : words) {
                int[] tempMap = new int[26];
                System.arraycopy(charMap,0,tempMap,0,charMap.length);
                boolean check = true;
                for (int i = 0; i < word.length(); i++) {
                    if (tempMap[word.charAt(i) - 'a']-- == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    count += word.length();
                }
            }
            return count;
        }
    }
}