package easy.array.checkifitisastraightline;
/**
 * CheckIfItIsAStraightLine
 * 
 * @author john 2020/8/2
 */
public class CheckIfItIsAStraightLine {
    class Solution {
        public boolean checkStraightLine(int[][] coordinates) {
            int deltaY = coordinates[1][1] - coordinates[0][1];
            int deltaX = coordinates[1][0] - coordinates[0][0];
            int gcd = gcd(deltaY, deltaX);
            deltaX /= gcd;
            deltaY /= gcd;
            if (deltaX == 0) {
                for (int i = 2; i < coordinates.length; i++) {
                    if (coordinates[i][0] != coordinates[0][0]) {
                        return false;
                    }
                }
            } else if (deltaY == 0) {
                for (int i = 2; i < coordinates.length; i++) {
                    if (coordinates[i][1] != coordinates[0][1]) {
                        return false;
                    }
                }
            } else {
                for (int i = 1; i < coordinates.length - 1; i++) {
                    int dY = coordinates[i + 1][1] - coordinates[i][1];
                    int dX = coordinates[i + 1][0] - coordinates[i][0];
                    if (dX / deltaX * deltaY != dY) {
                        return false;
                    }
                }
            }
            return true;
        }
        
        private int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }
    }
}