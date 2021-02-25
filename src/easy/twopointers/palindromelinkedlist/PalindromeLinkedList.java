package easy.twopointers.palindromelinkedlist;

/**
 * PalindromeLinkedList
 *
 * @author john 2021/2/25
 */
public class PalindromeLinkedList {
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
    public boolean isPalindrome(ListNode head) {
      if (head == null) return true;
      var slow = head;
      var fast = head;
      while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }
      ListNode head2 = null;
      slow = slow.next;
      while (slow != null) {
        var tmp = slow.next;
        slow.next = head2;
        head2 = slow;
        slow = tmp;
      }
      while (head != null && head2 != null) {
        if (head.val != head2.val) return false;
        head = head.next;
        head2 = head2.next;
      }
      return true;
    }
  }
}
