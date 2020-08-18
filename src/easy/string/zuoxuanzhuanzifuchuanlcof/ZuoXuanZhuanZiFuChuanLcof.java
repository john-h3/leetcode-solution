package easy.string.zuoxuanzhuanzifuchuanlcof;

/**
 * ZuoXuanZhuanZiFuChuanLcof
 * 
 * @author john 2020/8/18
 */
public class ZuoXuanZhuanZiFuChuanLcof {
    class Solution {
        public String reverseLeftWords(String s, int n) {
            return s.substring(n) + s.substring(0, n);
        }
    }
}