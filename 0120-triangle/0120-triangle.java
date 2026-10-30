import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        for (int c = 0; c < n; c++) {
            dp[c] = triangle.get(n - 1).get(c);
        }
        for (int r = n - 2; r >= 0; r--) {
            List<Integer> currentRow = triangle.get(r);
            for (int c = 0; c <= r; c++) {
                dp[c] = currentRow.get(c) + Math.min(dp[c], dp[c + 1]);
            }
        }
        return dp[0];
    }
}