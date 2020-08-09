package easy.string.ransomnote;

/**
 * RansomNote
 * 
 * @author john 2020/8/9
 */
public class RansomNote {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] hash = new int[0x7f];
            for (int i = 0; i < magazine.length(); i++) {
                hash[magazine.charAt(i)]++;
            }
            for (int i = 0; i < ransomNote.length(); i++) {
                if (hash[ransomNote.charAt(i)]-- == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}