class Solution {
    public int romanToInt(String s) {
        int k = 0;
        for(int i = 0;i<s.length();i++){
            int c = getValue(s.charAt(i));
            if(i+1<s.length()&&c<getValue(s.charAt(i+1))){
                k = k-c;
            }
            else{
                k = k+c;
            }
        }
        return k;
    }
    public int getValue(char i){
        if(i=='I')
        return 1;
        if(i=='V')
        return 5;
        if(i=='X')
        return 10;
        if(i=='L')
        return 50;
        if(i=='C')
        return 100;
        if(i=='D')
        return 500;
        if(i=='M')
        return 1000;
        return 0;
    }
}