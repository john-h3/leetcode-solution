package easy.bitmanipulation.convertintegerlcci;

/**
 * ConvertIntegerLcci
 *
 * @author john 2021/3/15
 */
public class ConvertIntegerLcci {
  class Solution {
    public int convertInteger(int A, int B) {
      return Integer.bitCount(A ^ B);
    }
  }
}