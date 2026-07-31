
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] a = new int[nums.length][2];
        for(int i = 0;i<n;i++){
            a[i][0] = nums[i];
            a[i][1] = i;
        }
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(a[j][0]>a[j+1][0]){
                    int temp = a[j][0];
                    int temp2 = a[j][1];

                    a[j][0] = a[j+1][0];
                    a[j][1] = a[j+1][1];

                    a[j+1][0] = temp;
                    a[j+1][1] = temp2;
                }
            }
        }
        int l = 0;
        int r  =n-1;
        while(l<r){
            int current = a[l][0]+a[r][0];
            if(current == target){
                return new int[]{a[l][1],a[r][1]};
            }
            else if(current<target)
            l++;
            else
            r--;
        }
        return new int[]{};
    }
}