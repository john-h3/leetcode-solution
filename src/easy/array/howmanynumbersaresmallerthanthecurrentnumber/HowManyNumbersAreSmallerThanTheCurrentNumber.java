package easy.array.howmanynumbersaresmallerthanthecurrentnumber;
/**
 * HowManyNumbersAreSmallerThanTheCurrentNumber
 * 
 * @author john 2020/8/3
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] map = new int[101];
            for (int num : nums) {
                map[num]++;
            }
            int sum = 0;
            for (int i = 0; i < map.length; i++) {
                int t = map[i];
                map[i] = sum;
                sum += t;
            }
            int[] answer = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                answer[i] = map[nums[i]];
            }
            return answer;
        }
    }
}