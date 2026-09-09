class Solution {
    public long countCommas(long n) {
        long total = 0;
        for(long min = 1000;min<=n;min = min*1000){
            total += (n-min+1);
        }
        return total;
    }
}