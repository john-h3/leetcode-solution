package easy.graph.intersectionoftwolinkedlists;

/**
 * IntersectionOfTwoLinkedLists
 *
 * @author john 2021/3/17
 */
public class IntersectionOfTwoLinkedLists {
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
      var nA = headA;
      var nB = headB;
      while (nA != nB) {
        nA = nA != null ? nA.next : headB;
        nB = nB != null ? nB.next : headA;
      }
      return nA;
    }
  }
}