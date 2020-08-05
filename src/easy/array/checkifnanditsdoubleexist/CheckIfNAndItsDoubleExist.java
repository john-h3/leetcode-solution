package easy.array.checkifnanditsdoubleexist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * CheckIfNAndItsDoubleExist
 * 
 * @author john 2020/8/6
 */
public class CheckIfNAndItsDoubleExist {
    class Solution {
        public boolean checkIfExist(int[] arr) {
            int[] hash = new int[2001];
            for (int i : arr) {
                hash[1000+i]++;
            }
            if (hash[1000] >= 2) {
                return true;
            } else {
                hash[1000] = 0;
            }
            for (int i : arr) {
                if (Math.abs(i) <= 500) {
                    if (hash[2*i + 1000] > 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}