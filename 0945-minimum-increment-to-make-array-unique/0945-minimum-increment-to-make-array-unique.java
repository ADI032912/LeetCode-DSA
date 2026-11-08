import java.util.Arrays;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        Arrays.sort(nums);
        int moves = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int target = nums[i - 1]+1;
                moves += target - nums[i];
                nums[i] = target;
            }
        }
        return moves;
    }
}