package easy.array.mastermindlcci;

/**
 * MasterMindLcci
 *
 * @author john 2020/8/8
 */
public class MasterMindLcci {
    class Solution {
        public int[] masterMind(String solution, String guess) {
            int same = 0;
            for (int i = 0; i < 4; i++) {
                if (solution.charAt(i) == guess.charAt(i)) {
                    same++;
                }
            }
            int[] c1 = new int[0x7f];
            for (int i = 0; i < 4; i++) {
                c1[solution.charAt(i)]++;
            }
            for (int i = 0; i < 4; i++) {
                c1[guess.charAt(i)+32]++;
            }
            int equal = Math.min(c1['R'],c1['r']) + Math.min(c1['B'],c1['b']) + Math.min(c1['G'],c1['g']) + Math.min(c1['Y'],c1['y']);
            return new int[]{same, equal - same};
        }
    }
}