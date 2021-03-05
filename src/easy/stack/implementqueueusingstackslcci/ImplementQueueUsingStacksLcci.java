package easy.stack.implementqueueusingstackslcci;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ImplementQueueUsingStacksLcci
 *
 * @author john 2021/3/5
 */
public class ImplementQueueUsingStacksLcci {
  class MyQueue {
    Deque<Integer> stack1 = new LinkedList<>();
    Deque<Integer> stack2 = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
      stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
      peek();
      return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
      if (stack2.isEmpty()) {
        while (!stack1.isEmpty()) {
          stack2.push(stack1.pop());
        }
      }
      return stack2.getFirst();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
      return stack1.isEmpty() && stack2.isEmpty();
    }
  }
}