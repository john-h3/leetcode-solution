package easy.math.findpositiveintegersolutionforagivenequation;

import java.util.ArrayList;
import java.util.List;

/**
 * FindPositiveIntegerSolutionForAGivenEquation
 *
 * @author john 2021/1/20
 */
public class FindPositiveIntegerSolutionForAGivenEquation {
  interface CustomFunction {
    int f(int x, int y);
  }

  class Solution {
    public List<List<Integer>> findSolution(CustomFunction func, int z) {
      var result = new ArrayList<List<Integer>>();
      for (int i = 1; i <= 1000; i++) {
        boolean overall = true;
        for (int j = 1; j <= 1000; j++) {
          if (func.f(i, j) == z) {
            result.add(List.of(i, j));
          } else if (func.f(i, j) > z) {
            break;
          }
          overall = false;
        }
        if (overall) break;
      }
      return result;
    }
  }
}
