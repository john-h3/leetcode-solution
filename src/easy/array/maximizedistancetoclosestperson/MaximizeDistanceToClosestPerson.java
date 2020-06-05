package easy.array.maximizedistancetoclosestperson;

import java.util.ArrayList;
import java.util.List;

/**
 * MaximizeDistanceToClosestPerson
 *
 * @author john 2020/6/5
 */
public class MaximizeDistanceToClosestPerson {
    class Solution {
        public int maxDistToClosest(int[] seats) {
            int max = 1;
            int s = 0;
            if (seats[0] == 0) {
                while (seats[++s] == 0) {
                }
            }
            max = Math.max(max, s);
            int e = seats.length;
            if (seats[e - 1] == 0) {
                while (seats[--e] == 0) {
                }
            }
            max = Math.max(max, seats.length - e - 1);
            int startIdx = -1;
            int endIdx = -1;
            for (int i = s; i < e; i++) {
                if (seats[i] == 0) {
                    if (startIdx == -1) {
                        startIdx = i;
                    }
                    endIdx = i;
                } else {
                    if (startIdx != -1) {
                        max = Math.max(max, (endIdx - startIdx + 2) / 2);
                        startIdx = -1;
                        endIdx = -1;
                    }
                }
            }
            if (startIdx != -1) {
                max = Math.max(max, (endIdx - startIdx + 2) / 2);
            }
            return max;
        }
    }
}