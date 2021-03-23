package easy.linkedlist.intersectionoftwolinkedlistslcci;

/**
 * IntersectionOfTwoLinkedListsLcci
 *
 * @author john 2021/3/23
 */
public class IntersectionOfTwoLinkedListsLcci {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
  }
  public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      var n1 = headA;
      var n2 = headB;
      while (n1 != n2) {
        n1 = n1 == null ? headB : n1.next;
        n2 = n2 == null ? headA : n2.next;
      }
      return n1;
    }
  }
}