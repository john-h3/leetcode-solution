package easy.string.stringrotationlcci;

/**
 * StringRotationLcci
 * 
 * @author john 2020/8/18
 */
public class StringRotationLcci {
    class Solution {
        public boolean isFlipedString(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            s1 += s1;
            return s1.contains(s2);
        }
    }
}