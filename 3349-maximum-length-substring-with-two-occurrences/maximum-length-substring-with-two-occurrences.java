class Solution {
    public int maximumLengthSubstring(String s) {
        int l = 0;
        int max = 0;
        int[] f = new int[26];
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            f[c-'a']++;
            while(f[c-'a']>2){
                char c1 = s.charAt(l);
                f[c1-'a']--;
                l++;
            }
            max = Math.max(max,(i-l+1));
        }
        return max;
    }
}