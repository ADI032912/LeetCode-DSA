class Solution {
    public int heightChecker(int[] heights) {
        int[] counts = new int[101];
        int mismatches = 0;
        int currentExpectedHeight = 1;
          for (int h : heights) {
            counts[h]++;
        }
        for (int i = 0; i < heights.length; i++) {
            while (counts[currentExpectedHeight] == 0) {
                currentExpectedHeight++;
            }
            if (heights[i] != currentExpectedHeight) {
                mismatches++;
            }
            counts[currentExpectedHeight]--;
        }
        return mismatches;
    }
}