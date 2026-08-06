class Solution {
    public int smallestNumber(int n, int t) {
        int c = n;
        while(true){
            int digit =1;
            int temp = c;
            while(temp>0){
                digit = digit*(temp%10);
                temp = temp/10;
            }
            if(digit%t==0){
                return c;
            }
            c++;
        }
    }
}