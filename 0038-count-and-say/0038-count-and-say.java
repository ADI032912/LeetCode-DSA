class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int step = 2; step <= n; step++) {
            StringBuilder next = new StringBuilder();
            int len = s.length();
            int i = 0;
            while (i < len) {
                char ch = s.charAt(i);
                int count = 0;
                while (i < len && s.charAt(i) == ch) {
                    count++;
                    i++;
                }
                next.append(count).append(ch);
            }
            s = next.toString();
        }
        return s;
    }
}