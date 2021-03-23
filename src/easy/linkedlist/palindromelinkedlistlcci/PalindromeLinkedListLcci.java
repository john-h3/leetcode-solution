package easy.linkedlist.palindromelinkedlistlcci;

import java.util.ArrayList;

/**
 * PalindromeLinkedListLcci
 *
 * @author john 2021/3/23
 */
public class PalindromeLinkedListLcci {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  class Solution {
    public boolean isPalindrome(ListNode head) {
      var li = new ArrayList<Integer>();
      while (head != null) {
        li.add(head.val);
        head = head.next;
      }
      int l = li.size();
      for (int i = 0; i < l / 2; i++) {
        if (!li.get(i).equals(li.get(l - 1 - i))) {
          return false;
        }
      }
      return true;
    }
  }
}