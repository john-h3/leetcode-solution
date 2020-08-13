package easy.string.tolowercase;

/**
 * ToLowerCase
 * 
 * @author john 2020/8/13
 */
public class ToLowerCase {
    class Solution {
        public String toLowerCase(String str) {
            char[] newStr = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    ch += 32;
                }
                newStr[i] = ch;
            }
            return new String(newStr);
        }
    }
}