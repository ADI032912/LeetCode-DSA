class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];
        for (int i = 0; i < n; i++) {
            long val = nums[i];
            squares[i] = val * val;
        }
        Arrays.sort(squares);
        int numSub = n / 2;
        long totalScore = 0;
        for (int i = 0; i < numSub; i++) {
            totalScore -= squares[i];
        }
        for (int i = numSub; i < n; i++) {
            totalScore += squares[i];
        }
        return totalScore;
    }
}