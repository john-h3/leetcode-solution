package easy.twopointers.kthnodefromendoflistlcci;

/**
 * KthNodeFromEndOfListLcci
 *
 * @author john 2021/2/26
 */
public class KthNodeFromEndOfListLcci {
  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  class Solution {
    public int kthToLast(ListNode head, int k) {
      var p1 = head;
      var p2 = head;
      for (int i = 1; i < k; i++) {
        if (p2 == null) throw new IllegalArgumentException();
        p2 = p2.next;
      }
      while (p2.next != null) {
        p1 = p1.next;
        p2 = p2.next;
      }
      return p1.val;
    }
  }
}
