package daily._202208._20220823;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Helper {
    public static void main(String[] args) {
        var rand = new Random();
        var n = 6;
        if (n < 2 || n > 30) {
            throw new IllegalArgumentException();
        }
        var matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[0][i] = i % 2;
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i - 1][j] == 0 ? 1 : 0;
            }
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("swapping...");
        for (int i = 0; i < 10000; i++) {
            if (rand.nextBoolean()) {
                // 行交换
                var r1 = rand.nextInt(n);
                var r2 = r1;
                while (r2 == r1) {
                    r2 = rand.nextInt(n);
                }
                swapRow(matrix, r1, r2);
            } else {
                // 列交换
                var c1 = rand.nextInt(n);
                var c2 = c1;
                while (c2 == c1) {
                    c2 = rand.nextInt(n);
                }
                swapCol(matrix, c1, c2);
            }
        }
        System.out.println("swapped");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("test case format:");
        System.out.println(Arrays.deepToString(matrix));
        System.out.printf("min step is: %03d\n", new Daily().new Solution().movesToChessboard(matrix));

        System.out.println("now you can try to manual swap it:");
        var scanner = new Scanner(System.in);
        var step = 0;
        while (scanner.hasNext()) {
            var input = scanner.nextLine();
            args = input.split("\s+");
            var swapOpt = args[0];
            var v1 = Integer.parseInt(args[1]);
            var v2 = Integer.parseInt(args[2]);
            switch (swapOpt) {
                case "r" -> {
                    swapRow(matrix, v1, v2);
                    System.out.printf("step %03d result:%n", ++step);
                    for (int[] row : matrix) {
                        System.out.println(Arrays.toString(row));
                    }
                    break;
                }
                case "c" -> {
                    swapCol(matrix, v1, v2);
                    System.out.printf("step %03d result:%n", ++step);
                    for (int[] row : matrix) {
                        System.out.println(Arrays.toString(row));
                    }
                    break;
                }
            }
        }
    }

    private static void swapRow(int[][] matrix, int r1, int r2) {
        var n = matrix.length;
        // 暂存目标行
        var tmp = Arrays.copyOf(matrix[r2], n);
        System.arraycopy(matrix[r1], 0, matrix[r2], 0, n);
        System.arraycopy(tmp, 0, matrix[r1], 0, n);
    }

    private static void swapCol(int[][] matrix, int c1, int c2) {
        var n = matrix.length;
        var tmp = new int[n];
        // 暂存目标列
        for (int i = 0; i < n; i++) {
            tmp[i] = matrix[i][c2];
        }
        // 覆盖目标列
        for (int i = 0; i < n; i++) {
            matrix[i][c2] = matrix[i][c1];
        }
        // 取回暂存列
        for (int i = 0; i < n; i++) {
            matrix[i][c1] = tmp[i];
        }
    }
}
