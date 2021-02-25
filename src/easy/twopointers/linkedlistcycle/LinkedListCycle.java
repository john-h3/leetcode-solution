package easy.twopointers.linkedlistcycle;

/**
 * LinkedListCycle
 *
 * @author john 2021/2/25
 */
public class LinkedListCycle {
  class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
  }
  
  public class Solution {
    public boolean hasCycle(ListNode head) {
      if (head == null || head.next == null) return false;
      var slow = head;
      var fast = head.next;
      while (fast != slow) {
        if (fast == null || fast.next == null) return false;
        slow = slow.next;
        fast = fast.next.next;
      }
      return true;
    }
  }
}