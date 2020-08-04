package easy.array.elementappearingmorethan25insortedarray;

/**
 * ElementAppearingMoreThan25InSortedArray
 *
 * @author john 2020/8/4
 */
public class ElementAppearingMoreThan25InSortedArray {
    class Solution {
        public int findSpecialInteger(int[] arr) {
            int r = arr.length / 4;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[i + r]) {
                    return arr[i];
                }
            }
            return -1;
        }
    }
}