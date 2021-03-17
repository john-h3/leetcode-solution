package easy.graph.removelinkedlistelements;

/**
 * RemoveLinkedListElements
 *
 * @author john 2021/3/17
 */
public class RemoveLinkedListElements {
  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  class Solution {
    public ListNode removeElements(ListNode head, int val) {
      var HEAD = new ListNode(0, head);
      var node = HEAD;
      while (node.next != null) {
        if (node.next.val == val) node.next = node.next.next;
        else node = node.next;
      }
      return HEAD.next;
    }
  }
}