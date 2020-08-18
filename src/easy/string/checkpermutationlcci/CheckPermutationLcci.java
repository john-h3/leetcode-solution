package easy.string.checkpermutationlcci;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * CheckPermutationLcci
 * 
 * @author john 2020/8/18
 */
public class CheckPermutationLcci {
    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }
            int[] counter = new int[26];
            for (char c : s1.toCharArray()) {
                counter[c - 'a']++;
            }
            for (char c : s2.toCharArray()) {
                counter[c - 'a']--;
            }
            for (int c : counter) {
                if (c > 0) {
                    return false;
                }
            }
            return true;
        }
    }
}