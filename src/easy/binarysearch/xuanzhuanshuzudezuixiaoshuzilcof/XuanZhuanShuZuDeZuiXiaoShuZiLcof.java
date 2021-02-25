package easy.binarysearch.xuanzhuanshuzudezuixiaoshuzilcof;

/**
 * XuanZhuanShuZuDeZuiXiaoShuZiLcof
 *
 * @author john 2021/2/24
 */
public class XuanZhuanShuZuDeZuiXiaoShuZiLcof {
  class Solution {
    public int minArray(int[] numbers) {
      int low = 0, high = numbers.length - 1;
      while (low < high) {
        var mid = (low + high) >>> 1;
        var val = numbers[mid];
        if (val < numbers[high]) high = mid;
        else if (val > numbers[high]) low = mid + 1;
        else high--;
      }
      return numbers[low];
    }
  }
}