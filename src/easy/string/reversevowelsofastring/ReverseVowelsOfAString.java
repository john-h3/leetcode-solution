package easy.string.reversevowelsofastring;

/**
 * ReverseVowelsOfAString
 *
 * @author john 2020/8/9
 */
public class ReverseVowelsOfAString {
    class Solution {
        public String reverseVowels(String s) {
            boolean[] vowelMap = new boolean[0x7f];
            vowelMap['a'] = true;
            vowelMap['A'] = true;
            vowelMap['e'] = true;
            vowelMap['E'] = true;
            vowelMap['i'] = true;
            vowelMap['I'] = true;
            vowelMap['o'] = true;
            vowelMap['O'] = true;
            vowelMap['u'] = true;
            vowelMap['U'] = true;
            char[] chars = s.toCharArray();
            int p1 = 0;
            int p2 = chars.length - 1;
            while (p1 < p2) {
                if (vowelMap[chars[p1]]) {
                    if (vowelMap[chars[p2]]) {
                        char ch = chars[p1];
                        chars[p1] = chars[p2];
                        chars[p2] = ch;
                        p1++;
                        p2--;
                    } else {
                        p2--;
                    }
                } else {
                    p1++;
                }
            }
            return new String(chars);
        }
    }
}