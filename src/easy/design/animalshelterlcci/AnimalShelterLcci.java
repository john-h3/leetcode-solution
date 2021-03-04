package easy.design.animalshelterlcci;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * AnimalShelterLcci
 *
 * @author john 2021/3/4
 */
public class AnimalShelterLcci {
  class AnimalShelf {
    private Queue<int[]> catQueue = new LinkedList<>();
    private Queue<int[]> dogQueue = new LinkedList<>();
    private int idx = 0;

    public AnimalShelf() {}

    public void enqueue(int[] animal) {
      if (animal[1] == 0) catQueue.add(new int[] {animal[0], idx++});
      else dogQueue.add(new int[] {animal[0], idx++});
    }

    public int[] dequeueAny() {
      if (catQueue.isEmpty() && dogQueue.isEmpty()) return new int[] {-1, -1};
      else if (catQueue.isEmpty()) return new int[] {dogQueue.poll()[0], 1};
      else if (dogQueue.isEmpty()) return new int[] {catQueue.poll()[0], 0};
      else
        return catQueue.peek()[1] < dogQueue.peek()[1]
            ? new int[] {catQueue.poll()[0], 0}
            : new int[] {dogQueue.poll()[0], 1};
    }

    public int[] dequeueDog() {
      if (dogQueue.isEmpty()) return new int[] {-1, -1};
      return new int[]{dogQueue.poll()[0], 1};
    }

    public int[] dequeueCat() {
      if (catQueue.isEmpty()) return new int[] {-1, -1};
      return new int[]{catQueue.poll()[0], 0};
    }
  }
}
