package easy.array.findnuniqueintegerssumuptozero;
/**
 * FindNUniqueIntegersSumUpToZero
 * 
 * @author john 2020/8/4
 */
public class FindNUniqueIntegersSumUpToZero {
    class Solution {
        public int[] sumZero(int n) {
            if (n == 1) {
                return new int[]{0};
            } else {
                int[] answer = new int[n];
                int sum = 0;
                for (int i = 1; i < n; i++) {
                    answer[i - 1] = i;
                    sum += i;
                }
                answer[n - 1] = -sum;
                return answer;
            }
        }
    }
}