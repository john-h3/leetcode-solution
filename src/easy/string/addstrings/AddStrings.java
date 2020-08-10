package easy.string.addstrings;
/**
 * AddStrings
 * 
 * @author john 2020/8/10
 */
public class AddStrings {
    class Solution {
        public String addStrings(String num1, String num2) {
            StringBuilder sb = new StringBuilder();
            if (num1.length() < num2.length()) {
                for (int i = 0; i < num2.length() - num1.length(); i++) {
                    sb.append(0);
                }
                num1 = sb.append(num1).toString();
            } else if (num2.length() < num1.length()) {
                for (int i = 0; i < num1.length() - num2.length(); i++) {
                    sb.append(0);
                }
                num2 = sb.append(num2).toString();
            }
            StringBuilder result = new StringBuilder();
            char[] n1 = num1.toCharArray();
            char[] n2 = num2.toCharArray();
            boolean carry = false;
            for (int i = n1.length - 1; i >= 0; i--) {
                int sum = n1[i] + n2[i] - 2 * '0';
                if (carry) {
                    sum ++;
                }
                if (sum > 9) {
                    sum -= 10;
                    carry = true;
                } else {
                    carry = false;
                }
                result.append(sum);
            }
            if (carry) {
                result.append(1);
            }
            return result.reverse().toString();
        }
    }
}