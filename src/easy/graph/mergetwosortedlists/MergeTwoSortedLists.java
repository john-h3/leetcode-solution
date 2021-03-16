package easy.graph.mergetwosortedlists;

/**
 * MergeTwoSortedLists
 *
 * @author john 2021/3/16
 */
public class MergeTwoSortedLists {
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      var root = new ListNode();
      var node = root;
      while (l1 != null && l2 != null) {
        if (l1.val <= l2.val) {
          node = node.next = l1;
          l1 = l1.next;
        } else {
          node = node.next = l2;
          l2 = l2.next;
        }
      }
      node.next = l1 == null ? l2 : l1;
      return root.next;
    }
  }
}
