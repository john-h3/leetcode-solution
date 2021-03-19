package easy.linkedlist.shanchulianbiaodejiedianlcof;

/**
 * ShanChuLianBiaoDeJieDianLcof
 *
 * @author john 2021/3/19
 */
public class ShanChuLianBiaoDeJieDianLcof {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  class Solution {
    public ListNode deleteNode(ListNode head, int val) {
      var sentinel = new ListNode(-1);
      sentinel.next = head;
      var prev = sentinel;
      while (head != null) {
        if (head.val == val) {
          head = head.next;
          prev.next = head;
        } else {
          head = head.next;
          prev = prev.next;
        }
      }
      return sentinel.next;
    }
  }
}