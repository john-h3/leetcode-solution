package easy.bitmanipulation.convertbinarynumberinalinkedlisttointeger;

/**
 * ConvertBinaryNumberInALinkedListToInteger
 *
 * @author john 2021/3/11
 */
public class ConvertBinaryNumberInALinkedListToInteger {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  class Solution {
    public int getDecimalValue(ListNode head) {
      var ans = head.val;
      while (head.next != null) {
        ans <<= 1;
        ans += (head = head.next).val;
      }
      return ans;
    }
  }
}