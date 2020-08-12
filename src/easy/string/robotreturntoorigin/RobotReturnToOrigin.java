package easy.string.robotreturntoorigin;

/**
 * RobotReturnToOrigin
 *
 * @author john 2020/8/12
 */
public class RobotReturnToOrigin {
    class Solution {
        public boolean judgeCircle(String moves) {
            int[] counter = new int[0x7f];
            for (int i = 0; i < moves.length(); i++) {
                counter[moves.charAt(i)]++;
            }
            return counter['R'] == counter['L'] && counter['U'] == counter['D'];
        }
    }
}