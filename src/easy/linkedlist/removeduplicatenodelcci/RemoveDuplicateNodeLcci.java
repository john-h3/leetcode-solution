package easy.linkedlist.removeduplicatenodelcci;

/**
 * RemoveDuplicateNodeLcci
 *
 * @author john 2021/3/22
 */
public class RemoveDuplicateNodeLcci {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
      if (head == null) return null;
      var table = new boolean[20001];
      var prev = head;
      var node = head.next;
      table[head.val] = true;
      while (node != null) {
        if (table[node.val]) prev.next = node = node.next;
        else {
          table[node.val] = true;
          prev = node;
          node = node.next;
        }
      }
      return head;
    }
  }
}