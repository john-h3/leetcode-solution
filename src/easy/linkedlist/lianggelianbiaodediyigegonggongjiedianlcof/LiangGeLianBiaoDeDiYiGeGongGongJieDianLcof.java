package easy.linkedlist.lianggelianbiaodediyigegonggongjiedianlcof;

/**
 * LiangGeLianBiaoDeDiYiGeGongGongJieDianLcof
 *
 * @author john 2021/3/22
 */
public class LiangGeLianBiaoDeDiYiGeGongGongJieDianLcof {
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
      var p1 = headA;
      var p2 = headB;
      while (p1 != p2) {
        p1 = p1 == null ? headB : p1.next;
        p2 = p2 == null ? headA : p2.next;
      }
      return p1;
    }
  }
}