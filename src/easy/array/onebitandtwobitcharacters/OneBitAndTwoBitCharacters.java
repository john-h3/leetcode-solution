package easy.array.onebitandtwobitcharacters;
/**
 * OneBitAndTwoBitCharacters
 * 
 * @author john 2020/6/3
 */
public class OneBitAndTwoBitCharacters {
    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
            int bitsLen = bits.length;
            if (bitsLen == 1) {
                return true;
            }
            if (bits[bitsLen - 1] != 0) {
                return false;
            }
            int count = 0;
            for (int i = 0; i < bitsLen - 1; i++) {
                if (bits[i] == 0) {
                    count++;
                } else {
                    count += 2;
                    i++;
                }
            }
            return count < bitsLen;
        }
    }
}