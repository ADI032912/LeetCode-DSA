class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum1 = 0;
        int product = 1;
        while(temp!=0){
            int m = temp%10;
            sum1 = sum1 + m;
            product = product * m;
            temp = temp/10;
        }
        int sum2 = sum1+product;
        if((n%sum2)==0){
            return true;
        }
        return false;
    }
}