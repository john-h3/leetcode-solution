package easy.array.replaceelementswithgreatestelementonrightside;
/**
 * ReplaceElementsWithGreatestElementOnRightSide
 * 
 * @author john 2020/8/4
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    class Solution {
        public int[] replaceElements(int[] arr) {
            int[] maxArr = new int[arr.length];
            maxArr[maxArr.length - 1] = -1;
            for (int i = maxArr.length - 2; i >= 0; i--) {
                maxArr[i] = Math.max(arr[i + 1], maxArr[i + 1]);
            }
            return maxArr;
        }
    }
}