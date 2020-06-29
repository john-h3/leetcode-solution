package easy.dynamicprogramming.rangesumqueryimmutable;
/**
 * RangeSumQueryImmutable
 * 
 * @author john 2020/6/29
 */
public class RangeSumQueryImmutable {
    class NumArray {
        int[] arr;

        public NumArray(int[] nums) {
            arr = nums;
            for (int i = 1; i < arr.length; i++) {
                arr[i] += arr[i - 1];
            }
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return arr[j];
            } else {
                return arr[j] - arr[i - 1];
            }
        }
    }
}