package easy.string.pathcrossing;

import java.util.HashSet;
import java.util.Set;

/**
 * PathCrossing
 *
 * @author john 2020/8/18
 */
public class PathCrossing {
    class Solution {
        public boolean isPathCrossing(String path) {
            Set<Integer> set = new HashSet<>();
            int x = 0, y = 0;
            set.add(0);
            for (char c : path.toCharArray()) {
                switch (c) {
                    case 'N':
                        y++;
                        break;
                    case 'S':
                        y--;
                        break;
                    case 'E':
                        x++;
                        break;
                    case 'W':
                        x--;
                        break;
                    default:
                }
                int pos = x * 10000 + y;
                if (set.contains(pos)) {
                    return true;
                } else {
                    set.add(pos);
                }
            }
            return false;
        }
    }
}