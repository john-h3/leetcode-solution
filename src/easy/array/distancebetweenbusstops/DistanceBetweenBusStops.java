package easy.array.distancebetweenbusstops;

/**
 * DistanceBetweenBusStops
 *
 * @author john 2020/6/24
 */
public class DistanceBetweenBusStops {
    class Solution {
        public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            int totalDistance = 0;
            for (int d : distance) {
                totalDistance += d;
            }
            int d = 0;
            for (int i = Math.min(start, destination); i < Math.max(start, destination); i++) {
                d += distance[i];
            }
            return Math.min(d, totalDistance - d);
        }
    }
}