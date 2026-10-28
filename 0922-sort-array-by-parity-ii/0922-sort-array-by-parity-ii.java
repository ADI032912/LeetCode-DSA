class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int even = 0;
        int odd = 1;
        for (int x : nums) {
            if (x % 2 == 0) {
                res[even] = x;
                even += 2;
            } else {
                res[odd] = x;
                odd += 2;
            }
        }
        return res;
    }
}