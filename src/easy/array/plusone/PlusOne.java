package easy.array.plusone;

/**
 * PlusOne
 *
 * @author john 2020/4/25
 */
public class PlusOne {
    class Solution {
        public int[] plusOne(int[] digits) {
            if (needNewArr(digits)) {
                int[] newArr = new int[digits.length + 1];
                newArr[0] = 1;
                return newArr;
            } else {
                return carrying(digits, digits.length - 1);
            }
        }

        private boolean needNewArr(int[] digits) {
            for (int digit : digits) {
                if (digit != 9) {
                    return false;
                }
            }
            return true;
        }

        private int[] carrying(int[] digits, int idx) {
            digits[idx] += 1;
            if (digits[idx] == 10) {
                digits[idx] = 0;
                carrying(digits, --idx);
            }
            return digits;
        }
    }
}