class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] seen = new boolean[101];
        for(int num:nums){
            seen[num] = true;
        }
        for(int i = 1; ;i++){
            int target = k*i;
            if(target>=seen.length||!seen[target]){
                return target;
            }
        }
    }
}