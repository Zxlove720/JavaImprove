package exercise;

public class Exercise {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] gridNew = {{8, 4, 8, 7}, {7, 4, 7, 7}, {9, 4, 8, 7}, {3, 3, 3, 3}};
        System.out.println(solution.maxIncreaseKeepingSkyline(gridNew));
    }
}


class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += Math.min(rowMax[i], colMax[j]) - grid[i][j];
            }
        }
        return ans;
    }
}