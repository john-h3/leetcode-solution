package easy.dynamicprogramming.divisorgame;

/**
 * DivisorGame
 *
 * @author john 2020/7/29
 */
public class DivisorGame {
    class Solution {
        public boolean divisorGame(int N) {
            return (N & 1) == 0;
        }
    }
}