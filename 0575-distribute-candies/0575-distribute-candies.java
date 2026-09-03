class Solution {
    public int distributeCandies(int[] candyType) {
        int limit = candyType.length/2;
        HashSet<Integer> h1 = new HashSet<>();
        for(int candy:candyType){
            h1.add(candy);
            if(h1.size()==limit){
                return limit;
            }
        }
        return Math.min(h1.size(),limit);
    }
}