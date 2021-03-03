package easy.design.threeinonelcci;

/**
 * ThreeInOneLcci
 *
 * @author john 2021/3/3
 */
public class ThreeInOneLcci {
  class TripleInOne {
    int[] stack;
    int[] p = new int[3];
    int stackSize;
    public TripleInOne(int stackSize) {
      this.stackSize = stackSize;
      stack = new int[stackSize * 3];
    }

    public void push(int stackNum, int value) {
      if (p[stackNum] < stackSize) {
        stack[stackNum * stackSize + p[stackNum]] = value;
        p[stackNum]++;
      }
    }

    public int pop(int stackNum) {
      if (p[stackNum] > 0) return stack[--p[stackNum] + stackNum * stackSize];
      return -1;
    }

    public int peek(int stackNum) {
      if (p[stackNum] > 0) return stack[p[stackNum] + stackNum * stackSize - 1];
      return -1;
    }

    public boolean isEmpty(int stackNum) {
      return p[stackNum] == 0;
    }
  }
}