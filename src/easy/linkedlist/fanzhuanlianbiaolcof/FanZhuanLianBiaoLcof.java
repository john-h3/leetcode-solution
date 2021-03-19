package easy.linkedlist.fanzhuanlianbiaolcof;

/**
 * FanZhuanLianBiaoLcof
 *
 * @author john 2021/3/19
 */
public class FanZhuanLianBiaoLcof {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  class Solution {
    public ListNode reverseList(ListNode head) {
      if (head == null || head.next == null) return head;
      var node = reverseList(head.next);
      head.next.next = head;
      head.next = null;
      return node;
    }
  }
}