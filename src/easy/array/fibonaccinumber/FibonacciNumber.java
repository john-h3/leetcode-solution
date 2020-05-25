package easy.array.fibonaccinumber;
/**
 * FibonacciNumber
 * 
 * @author john 2020/5/25
 */
public class FibonacciNumber {
    class Solution {
        public int fib(int n) {
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            // n > 1
            int v1 = 0;
            int v2 = 1;
            for (int i = 1; i < n; i++) {
                int temp = v2;
                v2 = v1 + v2;
                v1 = temp;
            }
            return v2;
        }
    }
}