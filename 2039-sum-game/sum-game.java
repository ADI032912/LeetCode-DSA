class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        double ans = 0.0;
        for(int i = 0;i<n/2;i++ ){
            if(num.charAt(i)=='?'){
                ans = ans+4.5;
            }
            else{
                ans = ans + (num.charAt(i)-'0');
            }
        }
        for(int i = n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                ans = ans - 4.5;
            }
            else{
                ans = ans - (num.charAt(i)-'0');
            }
        }
        return ans!=0.0;
    }
}