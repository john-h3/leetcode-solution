package easy.stack.minstacklcci;

import java.util.Deque;
import java.util.LinkedList;

/**
 * MinStackLcci
 *
 * @author john 2021/3/5
 */
public class MinStackLcci {
  class MinStack {
    Deque<Integer> deque = new LinkedList<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
      deque.addLast(deque.isEmpty() ? x : Math.min(x, deque.getLast()));
      deque.addFirst(x);
    }

    public void pop() {
      deque.removeFirst();
      deque.removeLast();
    }

    public int top() {
      return deque.getFirst();
    }

    public int getMin() {
      return deque.getLast();
    }
  }
}