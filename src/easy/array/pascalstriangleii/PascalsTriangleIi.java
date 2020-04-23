package easy.array.pascalstriangleii;

import java.util.ArrayList;
import java.util.List;

/**
 * PascalsTriangleIi
 * 
 * @author john 2020/4/16
 */
public class PascalsTriangleIi {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> list = new ArrayList<>();
            if (rowIndex <= 1) {
                list.add(1);
                if (rowIndex == 1) {
                    list.add(1);
                }
                return list;
            }
            long tmp = 1;
            list.add((int) tmp);
            int i = rowIndex;
            int j = 1;
            while (i > 0) {
                tmp = tmp * i-- / j++;
                list.add((int) tmp);
            }
            return list;
        }
    }
}