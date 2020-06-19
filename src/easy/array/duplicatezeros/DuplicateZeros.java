package easy.array.duplicatezeros;
/**
 * DuplicateZeros
 * 
 * @author john 2020/6/19
 */
public class DuplicateZeros {
    class Solution {
        public void duplicateZeros(int[] arr) {
            int[] tempArr = new int[arr.length];
            int p = 0;
            for (int i = 0; i < tempArr.length; i++) {
                tempArr[i] = arr[p++];
                if (tempArr[i] == 0 && i < tempArr.length - 1) {
                    tempArr[++i] = 0;
                }
            }
            System.arraycopy(tempArr, 0, arr, 0, arr.length);
        }
    }
}