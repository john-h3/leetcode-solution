package easy.linkedlist.deletemiddlenodelcci;

/**
 * DeleteMiddleNodeLcci
 *
 * @author john 2021/3/22
 */
public class DeleteMiddleNodeLcci {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  class Solution {
    public void deleteNode(ListNode node) {
      node.val = node.next.val;
      node.next = node.next.next;
    }
  }
}