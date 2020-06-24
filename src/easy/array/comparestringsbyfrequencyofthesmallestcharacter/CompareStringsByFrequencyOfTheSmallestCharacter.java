package easy.array.comparestringsbyfrequencyofthesmallestcharacter;

/**
 * CompareStringsByFrequencyOfTheSmallestCharacter
 *
 * @author john 2020/6/24
 */
public class CompareStringsByFrequencyOfTheSmallestCharacter {
    class Solution {
        public int[] numSmallerByFrequency(String[] queries, String[] words) {
            int[] map = new int[2001];
            for (String word : words) {
                int[] table = new int[26];
                for (int i = 0; i < word.length(); i++) {
                    table[word.charAt(i) - 'a']++;
                }
                for (int i : table) {
                    if (i > 0) {
                        map[i]++;
                        break;
                    }
                }
            }
            for (int i = 1; i < map.length; i++) {
                map[i] += map[i - 1];
            }
            int[] answer = new int[queries.length];
            int idx = 0;
            for (String query : queries) {
                char ch = 'z';
                int min = 0;
                for (int i = 0; i < query.length(); i++) {
                    if (query.charAt(i) < ch) {
                        ch = query.charAt(i);
                        min = 1;
                    } else if (query.charAt(i) == ch) {
                        min++;
                    }
                }
                answer[idx++] = map[2000] - map[min];
            }
            return answer;
        }
    }
}