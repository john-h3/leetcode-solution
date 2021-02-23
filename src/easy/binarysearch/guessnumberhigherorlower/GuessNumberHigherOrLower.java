package easy.binarysearch.guessnumberhigherorlower;

/**
 * GuessNumberHigherOrLower
 *
 * @author john 2021/2/23
 */
public class GuessNumberHigherOrLower {
  class GuessGame {
    int guess(int num) {
      return -1;
    }
  }

  public class Solution extends GuessGame {
    public int guessNumber(int n) {
      var start = 1;
      var end = n;
      var mid = start + (end - start) / 2;
      var gr = guess(mid);
      while (gr != 0) {
        if (gr > 0) start = mid + 1;
        else end = mid - 1;
        gr = guess(mid = start + (end - start) / 2);
      }
      return mid;
    }
  }
}
