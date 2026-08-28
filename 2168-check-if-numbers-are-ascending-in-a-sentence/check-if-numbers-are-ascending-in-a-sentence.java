class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int prev = -1;
        for(String a : arr){
            if(Character.isDigit(a.charAt(0))){
                int curr = Integer.parseInt(a);
            
            if(curr<=prev){
                return false;
            }
            
            prev = curr;
            }
        }
        return true;
    }
}
