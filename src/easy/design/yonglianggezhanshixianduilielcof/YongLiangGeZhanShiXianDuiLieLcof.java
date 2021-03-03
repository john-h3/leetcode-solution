package easy.design.yonglianggezhanshixianduilielcof;

import java.util.LinkedList;
import java.util.Stack;

/**
 * YongLiangGeZhanShiXianDuiLieLcof
 *
 * @author john 2021/3/3
 */
public class YongLiangGeZhanShiXianDuiLieLcof {
  class CQueue {
    LinkedList<Integer> stack1 = new LinkedList<>();
    LinkedList<Integer> stack2 = new LinkedList<>();

    public CQueue() {}

    public void appendTail(int value) {
      stack1.push(value);
    }

    public int deleteHead() {
      if (stack1.isEmpty() && stack2.isEmpty()) return -1;
      if (!stack2.isEmpty()) return stack2.pop();
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
      return stack2.pop();
    }
  }
}
