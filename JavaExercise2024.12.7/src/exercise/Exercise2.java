package exercise;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] nums = {7,8,3,4,15,13,4,1};
        double v = solution2.minimumAverage(nums);
        System.out.println(v);
    }
}


class Solution2 {
    public double minimumAverage(int[] nums){
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