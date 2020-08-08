package easy.array.romantointeger;

/**
 * RomanToInteger
 *
 * @author john 2020/8/8
 */
public class RomanToInteger {
    class Solution {
        public int romanToInt(String s) {
            int[] map = new int[26];
            map['I' - 65] = 1;
            map['V' - 65] = 5;
            map['X' - 65] = 10;
            map['L' - 65] = 50;
            map['C' - 65] = 100;
            map['D' - 65] = 500;
            map['M' - 65] = 1000;
            int v = 0;
            for (int i = 0; i < s.length(); i++) {
                int current = map[s.charAt(i) - 65];
                if (i < s.length() - 1) {
                    int next = map[s.charAt(i + 1) - 65];
                    if (next > current) {
                        v += next - current;
                        i++;
                        continue;
                    }
                }
                v += current;
            }
            return v;
        }
    }
}