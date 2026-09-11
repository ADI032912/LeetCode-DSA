class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        int j = 0;
        for(int n:nums){
            i = (i^n)& ~j;
            j = (j^n) & ~i;
        }
        return i;
    }
}