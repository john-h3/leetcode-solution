package easy.string.comparestringsbyfrequencyofthesmallestcharacter;

/**
 * CompareStringsByFrequencyOfTheSmallestCharacter
 *
 * @author john 2020/8/16
 */
public class CompareStringsByFrequencyOfTheSmallestCharacter {
    class Solution {
        public int[] numSmallerByFrequency(String[] queries, String[] words) {
            int[] queriesMinFreq = minFreq(queries);
            int[] wordsMinFreq = minFreq(words);
            int[] counter = new int[11];
            for (int f : wordsMinFreq) {
                counter[f]++;
            }
            for (int i = 1; i < counter.length; i++) {
                counter[i] += counter[i - 1];
            }
            int[] answer = new int[queries.length];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = counter[counter.length - 1] - counter[queriesMinFreq[i]];
            }
            return answer;
        }

        private int[] minFreq(String[] strings) {
            int[] minFreq = new int[strings.length];
            int idx = 0;
            for (String string : strings) {
                char min = 'z';
                int f = 0;
                for (int i = 0; i < string.length(); i++) {
                    char c = string.charAt(i);
                    if (c < min) {
                        min = c;
                        f = 1;
                    } else if (c == min) {
                        f++;
                    }
                }
                minFreq[idx++] = f;
            }
            return minFreq;
        }
    }
}