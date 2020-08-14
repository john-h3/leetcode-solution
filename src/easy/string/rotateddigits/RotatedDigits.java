package easy.string.rotateddigits;

/**
 * RotatedDigits
 *
 * @author john 2020/8/13
 */
public class RotatedDigits {
    class Solution {
        private int[] validMap = new int[]{1, 2, 3, 3, 3, 4, 5, 5, 6, 7};
        private int[] goodMap = new int[]{0, 0, 1, 1, 1, 2, 3, 3, 3, 4};

        public int rotatedDigits(int N) {
            return good(N);
        }

        private int pow(int a, int x) {
            return (int) Math.pow(a, x);
        }

        private int valid(int N) {
            if (N <= 9) {
                return validMap[N];
            } else {
                int x = 0;
                int tmp = N;
                while ((tmp /= 10) > 0) {
                    x++;
                }
                int n = N / pow(10, x);
                return validMap[n - 1] * pow(7, x) + (validMap[n] - validMap[n - 1] > 0 ? valid(N - n * pow(10, x)) : 0);
            }
        }

        private int good(int N) {
            int count;
            if (N <= 9) {
                return goodMap[N];
            } else {
                int x = 0;
                int tmp = N;
                while ((tmp /= 10) > 0) {
                    x++;
                }
                int n = N / pow(10, x);
                boolean b = validMap[n] - validMap[n - 1] > 0;
                count = valid(n * pow(10, x) - 1) - (validMap[n - 1] - goodMap[n - 1]) * pow(3, x);
                if (b) {
                    count += (goodMap[n] - goodMap[n - 1] > 0 ? valid(N - n * pow(10, x)) : good(N - n * pow(10, x)));
                }
                return count;
            }
        }
    }
}