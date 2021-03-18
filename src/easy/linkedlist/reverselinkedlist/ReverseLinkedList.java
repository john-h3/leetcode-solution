package easy.linkedlist.reverselinkedlist;

/**
 * ReverseLinkedList
 *
 * @author john 2021/3/18
 */
public class ReverseLinkedList {
  public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  class Solution {
    public ListNode reverseList(ListNode head) {
      return recursive(null, head);
    }

    private ListNode recursive(ListNode prev, ListNode current) {
      if (current == null) return prev;
      else {
        var head = recursive(current, current.next);
        current.next = prev;
        return head;
      }
    }
  }
}
