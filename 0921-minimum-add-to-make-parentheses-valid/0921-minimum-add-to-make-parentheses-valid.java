class Solution {
    public int minAddToMakeValid(String s) {
      int openBrackets = 0;
      int mismatches = 0;
      for(int i =0;i<s.length();i++){
        if(s.charAt(i)=='('){
            openBrackets++;
        }
        else{
            if(openBrackets>0){
                openBrackets--;
            }
            else{
                mismatches++;
            }
        }
      }
      return mismatches+openBrackets;  
    }
}