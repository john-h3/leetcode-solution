package easy.array.averagesalaryexcludingtheminimumandmaximumsalary;

import java.util.Arrays;

/**
 * AverageSalaryExcludingTheMinimumAndMaximumSalary
 *
 * @author john 2020/8/7
 */
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    class Solution {
        public double average(int[] salary) {
            int min = 1000000;
            int max = 1000;
            int sum = 0;
            for (int s : salary) {
                sum += s;
                if (s < min) {
                    min = s;
                }
                if (s > max) {
                    max = s;
                }
            }
            return ((double)sum - max - min) / (salary.length - 2);
        }
    }
}