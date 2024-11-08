package JavaExercise;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] array = {1,2,3,7,8,9};
        System.out.println(Solution.minimumAverage(array));
    }
}

class Solution {
    public static double minimumAverage(int[] nums){
        int n = nums.length / 2;
        Arrays.sort(nums);
        double average = 0;
        double min = Integer.MAX_VALUE;
        int i;
        int j;
        for (i = 0, j = nums.length - 1; i < n; i++, j--) {
            average = ((nums[i] + nums[j]) / 2.0);
            min = Math.min(average, min);
        }
        return min;
    }
}