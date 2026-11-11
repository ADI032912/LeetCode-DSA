class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1;
        long c2 = cost2;
        long cb = costBoth;
        long n1 = need1;
        long n2 = need2;
        if (cb >= c1 + c2) {
            return n1 * c1 + n2 * c2;
        }
        long minNeed = Math.min(n1, n2);
        long maxNeed = Math.max(n1, n2);
        long base = minNeed * cb;
        long remaining = maxNeed - minNeed;
        long remCostPerItem = 0;
        if(n1>n2){
            remCostPerItem = Math.min(c1, cb);
        }
        else{
            remCostPerItem = Math.min(c2, cb);
        }
        return base + remaining * remCostPerItem;
    }
}