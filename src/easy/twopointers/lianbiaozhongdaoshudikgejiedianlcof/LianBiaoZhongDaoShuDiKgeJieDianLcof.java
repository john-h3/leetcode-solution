package easy.twopointers.lianbiaozhongdaoshudikgejiedianlcof;

/**
 * LianBiaoZhongDaoShuDiKgeJieDianLcof
 *
 * @author john 2021/2/26
 */
public class LianBiaoZhongDaoShuDiKgeJieDianLcof {
  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
      var prev = head;
      var post = head;
      for (int i = 0; i < k - 1; i++) {
        if (post != null) post = post.next;
        else return null;
      }
      while (post.next != null) {
        prev = prev.next;
        post = post.next;
      }
      return prev;
    }
  }
}
