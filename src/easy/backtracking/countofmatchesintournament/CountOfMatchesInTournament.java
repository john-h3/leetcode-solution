package easy.backtracking.countofmatchesintournament;

/**
 * CountOfMatchesInTournament
 *
 * @author john 2021/3/2
 */
public class CountOfMatchesInTournament {
  class Solution {
    public int numberOfMatches(int n) {
      if (n == 1) return 0;
      else return (n >> 1) + numberOfMatches((n >> 1) + ((n & 1) == 0 ? 0 : 1));
    }
  }
}