package easy.string.groupsofspecialequivalentstrings;

import java.util.*;

/**
 * GroupsOfSpecialEquivalentStrings
 *
 * @author john 2020/8/14
 */
public class GroupsOfSpecialEquivalentStrings {
    class Solution {
        public int numSpecialEquivGroups(String[] A) {
            Set<String> set = new HashSet<>();
            for (String s : A) {
                int[][] counter = new int[2][26];
                for (int i = 0; i < s.length(); i++) {
                    counter[i & 1][s.charAt(i) - 'a']++;
                }
                StringBuilder builder = new StringBuilder();
                for (int[] ints : counter) {
                    for (int i = 0; i < ints.length; i++) {
                        if (ints[i] > 0) {
                            builder.append((char) ('a' + i)).append(ints[i]);
                        }
                    }
                }
                set.add(builder.toString());
            }
            return set.size();
        }
    }
}