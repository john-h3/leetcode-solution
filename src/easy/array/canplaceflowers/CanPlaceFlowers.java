package easy.array.canplaceflowers;

/**
 * CanPlaceFlowers
 *
 * @author john 2020/5/25
 */
public class CanPlaceFlowers {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            if (flowerbed.length == 1) {
                if (flowerbed[0] == 0) {
                    return true;
                } else {
                    return n == 0;
                }
            }
            int count = 0;
            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 0) {
                    if (i == 0) {
                        if (flowerbed[i + 1] == 0) {
                            flowerbed[i] = 1;
                            count++;
                        }
                    } else if (i == flowerbed.length - 1) {
                        if (flowerbed[i - 1] == 0) {
                            count++;
                        }
                    } else {
                        if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                            flowerbed[i] = 1;
                            count++;
                        }
                    }
                }
            }
            return n <= count;
        }
    }
}