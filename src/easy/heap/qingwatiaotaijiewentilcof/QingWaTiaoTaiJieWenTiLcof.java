package easy.heap.qingwatiaotaijiewentilcof;
/**
 * QingWaTiaoTaiJieWenTiLcof
 *
 * @author john 2021/4/6
 */
public class QingWaTiaoTaiJieWenTiLcof {
  class Solution {
    public int numWays(int n) {
      var dp = new int[n+2];
      dp[0] = dp[1] = 1;
      for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
        dp[i] %= 1000000007;
      }
      return dp[n];
    }
  }
}
