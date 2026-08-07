class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int d = 0;
        for(int n:nums){
            if(c==0){
                d = n;
            }
            if(n==d){
                c++;
            }
            else{
                c--;
            }
        }
        return d;
    }
}