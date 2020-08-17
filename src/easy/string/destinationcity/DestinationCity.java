package easy.string.destinationcity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * DestinationCity
 * 
 * @author john 2020/8/18
 */
public class DestinationCity {
    class Solution {
        public String destCity(List<List<String>> paths) {
            Set<String> fromCity = new HashSet<>();
            for (List<String> path : paths) {
                fromCity.add(path.get(0));
            }
            for (List<String> path : paths) {
                if (!fromCity.contains(path.get(1))) {
                    return path.get(1);
                }
            }
            return null;
        }
    }
}