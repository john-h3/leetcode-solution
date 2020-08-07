package easy.array.checkpermutationlcci;

/**
 * CheckPermutationLcci
 *
 * @author john 2020/8/8
 */
public class CheckPermutationLcci {
    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            int[] hash = new int[0xff];
            for (byte b : s1.getBytes()) {
                hash[b]++;
            }
            for (byte b : s2.getBytes()) {
                hash[b]--;
            }
            for (int c : hash) {
                if (c != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}