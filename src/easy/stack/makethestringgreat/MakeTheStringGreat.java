package easy.stack.makethestringgreat;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * MakeTheStringGreat
 *
 * @author john 2021/3/4
 */
public class MakeTheStringGreat {
  class Solution {
    public String makeGood(String s) {
      Deque<Character> stack = new ArrayDeque<>();
      for (int i = 0; i < s.length(); i++) {
        var ch = stack.peek();
        if (stack.isEmpty() || Math.abs(stack.peek() - s.charAt(i)) != 32) stack.push(s.charAt(i));
        else stack.pop();
      }
      var builder = new StringBuilder();
      for (Character ch : stack) {
        builder.append(ch);
      }
      return builder.reverse().toString();
    }
  }
}
