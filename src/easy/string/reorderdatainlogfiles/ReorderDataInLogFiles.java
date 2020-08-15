package easy.string.reorderdatainlogfiles;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ReorderDataInLogFiles
 *
 * @author john 2020/8/16
 */
public class ReorderDataInLogFiles {
    class Solution {
        public String[] reorderLogFiles(String[] logs) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < logs.length; i++) {
                map.put(logs[i], i);
            }
            Arrays.sort(logs, (s1, s2) -> {
                int s1SpIdx = s1.indexOf(" ");
                int s2SpIdx = s2.indexOf(" ");
                int compare;
                if (s1.charAt(s1SpIdx + 1) >= 'a' && s2.charAt(s2SpIdx + 1) < 'a') {
                    compare = -1;
                } else if (s1.charAt(s1SpIdx + 1) < 'a' && s2.charAt(s2SpIdx + 1) >= 'a') {
                    compare = 1;
                } else {
                    if (s1.charAt(s1SpIdx + 1) < 'a') {
                        compare = map.get(s1).compareTo(map.get(s2));
                    } else {
                        compare = s1.substring(s1SpIdx).compareTo(s2.substring(s2SpIdx));
                        if (compare == 0) {
                            compare = s1.substring(0, s1SpIdx).compareTo(s2.substring(0, s2SpIdx));
                        }
                    }
                }
                return compare;
            });
            return logs;
        }
    }
}