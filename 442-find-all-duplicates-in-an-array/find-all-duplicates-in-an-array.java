class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int t = Math.abs(nums[i])-1;
            if(nums[t]<0){
                l1.add(Math.abs(nums[i]));
            }
            else{
                nums[t] = -nums[t];
            }
        }
        return l1;
    }
}