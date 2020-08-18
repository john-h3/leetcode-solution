package easy.string.fanzhuandancishunxulcof;

import java.util.ArrayList;
import java.util.List;

/**
 * FanZhuanDanCiShunXuLcof
 *
 * @author john 2020/8/18
 */
public class FanZhuanDanCiShunXuLcof {
    class Solution {
        public String reverseWords(String s) {
            List<int[]> li = new ArrayList<>();
            char[] chars = s.toCharArray();
            int startIdx = 0;
            int length = 0;
            int alphaCount = 0;
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c != ' ') {
                    length++;
                    alphaCount++;
                } else {
                    if (length > 0) {
                        li.add(new int[]{startIdx, length});
                    }
                    startIdx = i + 1;
                    length = 0;
                }
            }
            if (length > 0) {
                li.add(new int[]{startIdx, length});
            }
            if (alphaCount == 0) {
                return "";
            }
            int spaceCount = li.size() - 1;
            char[] newStr = new char[alphaCount + spaceCount];
            int newStrIdx = 0;
            for (int i = li.size() - 1; i >= 0; i--) {
                int[] idxArr = li.get(i);
                System.arraycopy(chars, idxArr[0], newStr, newStrIdx, idxArr[1]);
                newStrIdx += idxArr[1];
                if (spaceCount-- > 0) {
                    newStr[newStrIdx++] = ' ';
                }
            }
            return new String(newStr);
        }
    }
}