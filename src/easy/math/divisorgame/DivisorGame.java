package easy.math.divisorgame;
/**
 * DivisorGame
 * 
 * @author john 2021/1/19
 */
public class DivisorGame {
  class Solution {
    public boolean divisorGame(int N) {
      return (N & 1) == 0;
    }
  }
}