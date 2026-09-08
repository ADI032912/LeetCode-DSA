class Solution {
    public int countCommas(int n) {
        int count = 0;
        long min = 1000;
        while(n>=min){
            count = count+(int)(n-min+1);
            min = min*1000;
        }
        return count;
    }
}