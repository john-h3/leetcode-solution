package easy.array.minimumtimevisitingallpoints;
/**
 * MinimumTimeVisitingAllPoints
 * 
 * @author john 2020/8/3
 */
public class MinimumTimeVisitingAllPoints {
    class Solution {
        public int minTimeToVisitAllPoints(int[][] points) {
            int time = 0;
            for (int i = 1; i < points.length; i++) {
                int[] startPoint = points[i - 1];
                int[] endPoint = points[i];
                int deltaX = Math.abs(startPoint[0] - endPoint[0]);
                int deltaY = Math.abs(startPoint[1] - endPoint[1]);
                if (deltaX == deltaY) {
                    time += deltaX;
                } else {
                    time += Math.abs(deltaX - deltaY) + Math.min(deltaX, deltaY);
                }
            }
            return time;
        }
    }
}