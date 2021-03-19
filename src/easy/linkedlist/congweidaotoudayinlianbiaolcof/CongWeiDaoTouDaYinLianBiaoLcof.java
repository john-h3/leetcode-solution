package easy.linkedlist.congweidaotoudayinlianbiaolcof;

/**
 * CongWeiDaoTouDaYinLianBiaoLcof
 *
 * @author john 2021/3/19
 */
public class CongWeiDaoTouDaYinLianBiaoLcof {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  class Solution {
    public int[] reversePrint(ListNode head) {
      var l = 0;
      var node = head;
      while (node != null) {
        l++;
        node = node.next;
      }
      var ans = new int[l];
      for (int i = ans.length - 1; i >= 0; i--) {
        ans[i] = head.val;
        head = head.next;
      }
      return ans;
    }
  }
}