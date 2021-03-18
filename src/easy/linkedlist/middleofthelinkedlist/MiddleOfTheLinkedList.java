package easy.linkedlist.middleofthelinkedlist;

/**
 * MiddleOfTheLinkedList
 *
 * @author john 2021/3/18
 */
public class MiddleOfTheLinkedList {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }

  class Solution {
    public ListNode middleNode(ListNode head) {
      var slow = head;
      var fast = head;
      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }
      return slow;
    }
  }
}