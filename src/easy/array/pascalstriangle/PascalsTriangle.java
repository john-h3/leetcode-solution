package easy.array.pascalstriangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * PascalsTriangle
 * 
 * @author john 2020/4/15
 */
public class PascalsTriangle {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> lists = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> list = new ArrayList<>();
                if (i == 0) {
                    list.add(1);
                } else {
                    list.add(1);
                    List<Integer> preList = lists.get(i - 1);
                    int bound = preList.size() - 1;
                    for (int j = 0; j < bound; j++) {
                        list.add(preList.get(j) + preList.get(j + 1));
                    }
                    list.add(1);
                }
                lists.add(list);
            }
            return lists;
        }
    }
}