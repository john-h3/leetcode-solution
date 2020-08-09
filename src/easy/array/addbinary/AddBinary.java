package easy.array.addbinary;

/**
 * AddBinary
 * 
 * @author john 2020/8/9
 */
public class AddBinary {
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder sb = new StringBuilder();
            if (a.length() < b.length()) {
                for (int i = 0; i < b.length() - a.length(); i++) {
                    sb.append(0);
                }
                sb.append(a);
                a = sb.toString();
            } else if (b.length() < a.length()) {
                for (int i = 0; i < a.length() - b.length(); i++) {
                    sb.append(0);
                }
                sb.append(b);
                b = sb.toString();
            }
            StringBuilder builder = new StringBuilder();
            boolean carry = false;
            for (int i = a.length() - 1; i >= 0; i--) {
                if (carry) {
                    carry = a.charAt(i) == '1' || b.charAt(i) == '1';
                    builder.append(a.charAt(i) == b.charAt(i) ? '1' : '0');
                } else {
                    carry = a.charAt(i) == '1' && b.charAt(i) == '1';
                    builder.append(a.charAt(i) != b.charAt(i) ? '1' : '0');
                }
            }
            if (carry) {
                builder.append(1);
            }
            return builder.reverse().toString();
        }
    }
}