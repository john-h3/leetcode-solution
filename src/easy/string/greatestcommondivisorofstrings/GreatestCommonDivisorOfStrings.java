package easy.string.greatestcommondivisorofstrings;

/**
 * GreatestCommonDivisorOfStrings
 * 
 * @author john 2020/8/16
 */
public class GreatestCommonDivisorOfStrings {
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            if (str1.length() == str2.length()) {
                if (str1.equals(str2)) {
                    return str1;
                } else {
                    return "";
                }
            } else {
                int gcdLength = gcd(str1.length(), str2.length());
                String gcdStr = str1.substring(0, gcdLength);
                for (int i = 0; i < str1.length(); i+= gcdLength) {
                    if (!str1.substring(i, i + gcdLength).equals(gcdStr)) {
                        return "";
                    }
                }
                for (int i = 0; i < str2.length(); i += gcdLength) {
                    if (!str2.substring(i, i + gcdLength).equals(gcdStr)) {
                        return "";
                    }
                }
                return gcdStr;
            }
        }

        private int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }
    }
}