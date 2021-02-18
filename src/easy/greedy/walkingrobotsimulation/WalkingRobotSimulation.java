package easy.greedy.walkingrobotsimulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * WalkingRobotSimulation
 *
 * @author john 2021/2/18
 */
public class WalkingRobotSimulation {
  class Solution {
    private HashMap<Integer, List<Integer>> map = new HashMap<>();

    public int robotSim(int[] commands, int[][] obstacles) {
      for (int[] obstacle : obstacles) {
        var list = map.computeIfAbsent(obstacle[0], k -> new ArrayList<>());
        list.add(obstacle[1]);
      }
      var max = 0;
      var pos = new int[3];
      for (int command : commands) {
        move(pos, command);
        max = Math.max(max, pos[0] * pos[0] + pos[1] * pos[1]);
      }
      return max;
    }

    private void move(int[] pos, int command) {
      if (command < 0) {
        if (command == -1) {
          if (pos[2] == 3) pos[2] = -1;
          pos[2]++;
        } else {
          if (pos[2] == 0) pos[2] = 4;
          pos[2]--;
        }
      } else {
        switch (pos[2]) {
          case 0:
            while (command-- > 0) {
              if (map.containsKey(pos[0]) && map.get(pos[0]).contains(pos[1] + 1)) break;
              else pos[1]++;
            }
            break;
          case 1:
            while (command-- > 0) {
              if (map.containsKey(pos[0] + 1) && map.get(pos[0] + 1).contains(pos[1])) break;
              else pos[0]++;
            }
            break;
          case 2:
            while (command-- > 0) {
              if (map.containsKey(pos[0]) && map.get(pos[0]).contains(pos[1] - 1)) break;
              else pos[1]--;
            }
            break;
          case 3:
            while (command-- > 0) {
              if (map.containsKey(pos[0] - 1) && map.get(pos[0] - 1).contains(pos[1])) break;
              else pos[0]--;
            }
        }
      }
    }
  }
}
