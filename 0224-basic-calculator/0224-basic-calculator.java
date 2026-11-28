class Solution {
    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        long result = 0;
        int sign = 1;
        int n = s.length();
        int i = 0;
        while (i < n) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                long num = 0;
                while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                result += sign * num;
            } else if (c == '+') {
                sign = 1;
                i++;
            } else if (c == '-') {
                sign = -1;
                i++;
            } else if (c == '(') {
                stack.push((int) result);
                stack.push(sign);
                result = 0;
                sign = 1;
                i++;
            } else if (c == ')') {
                int prevSign = stack.pop();
                long prevResult = stack.pop();
                result = prevResult + prevSign * result;
                i++;
            } else {
                i++;
            }
        }
        return (int)result;
    }
}