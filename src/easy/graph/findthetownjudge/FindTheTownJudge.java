package easy.graph.findthetownjudge;

/**
 * FindTheTownJudge
 *
 * @author john 2021/3/16
 */
public class FindTheTownJudge {
  class Solution {
    public int findJudge(int N, int[][] trust) {
      var c = new int[N + 1][2];
      for (int[] t : trust) {
        c[t[0]][0]++;
        c[t[1]][1]++;
      }
      for (int i = 1; i < c.length; i++) {
        if (c[i][1] == N - 1 && c[i][0] == 0) return i;
      }
      return -1;
    }
  }
}
