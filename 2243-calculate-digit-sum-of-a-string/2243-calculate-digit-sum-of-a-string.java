class Solution {
    public String digitSum(String s, int k) {
       StringBuilder sb = new StringBuilder(s);
        while (sb.length() > k) {
            StringBuilder nextRound = new StringBuilder();
            int n = sb.length();
            for (int i = 0; i < n; i += k) {
                int end = Math.min(i + k, n);
                int sum = 0;
                for (int j = i; j < end; j++) {
                    sum += sb.charAt(j) - '0';
                }
                nextRound.append(sum);
            }
            sb = nextRound;
        }
        return sb.toString(); 
    }
}