package easy.array.isuniquelcci;
/**
 * IsUniqueLcci
 * 
 * @author john 2020/8/8
 */
public class IsUniqueLcci {
    class Solution {
        public boolean isUnique(String astr) {
            byte[] bytes = astr.getBytes();
            int[] hash = new int[0xff];
            for (byte b : bytes) {
                hash[b]++;
                if (hash[b] > 1) {
                    return false;
                }
            }
            return true;
        }
    }
}