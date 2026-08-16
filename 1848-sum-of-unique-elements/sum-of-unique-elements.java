class Solution {
    public int sumOfUnique(int[] nums) {
        int count[] = new int[101];
        int sum = 0;
        for(int n : nums){
            if(count[n] == 0){
                sum = sum+n;
                count[n] = 1;
            }
            else if(count[n] == 1){
                sum = sum-n;
                count[n] = 2;
            }
        }
        return sum;
    }
}