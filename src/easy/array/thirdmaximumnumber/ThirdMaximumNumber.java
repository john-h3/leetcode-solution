package easy.array.thirdmaximumnumber;

/**
 * ThirdMaximumNumber
 *
 * @author john 2020/5/18
 */
public class ThirdMaximumNumber {
    class Solution {
        public int thirdMax(int[] nums) {
            int[] arr = new int[3];
            int count = 0;
            int idx = 0;
            for (; idx < nums.length; idx++) {
                int num = nums[idx];
                if (count == 0) {
                    arr[0] = num;
                    count++;
                } else if (count == 1) {
                    if (num > arr[0]) {
                        arr[1] = arr[0];
                        arr[0] = num;
                    } else if (num < arr[0]) {
                        arr[1] = num;
                    } else {
                        continue;
                    }
                    count++;
                } else if (count == 2) {
                    if (num > arr[0]) {
                        arr[2] = arr[1];
                        arr[1] = arr[0];
                        arr[0] = num;
                    } else if (num < arr[0] && num > arr[1]) {
                        arr[2] = arr[1];
                        arr[1] = num;
                    } else if (num < arr[1]) {
                        arr[2] = num;
                    } else {
                        continue;
                    }
                    count++;
                } else {
                    break;
                }
            }
            for (int i = idx; i < nums.length; i++) {
                int num = nums[i];
                if (num > arr[0]) {
                    arr[2] = arr[1];
                    arr[1] = arr[0];
                    arr[0] = num;
                } else if (num < arr[0] && num > arr[1]) {
                    arr[2] = arr[1];
                    arr[1] = num;
                } else if (num < arr[1] && num > arr[2]) {
                    arr[2] = num;
                }
            }
            if (count == 3) {
                return arr[2];
            } else {
                return arr[0];
            }
        }
    }
}