class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;
        for (int d = 2; d * d <= num; d++) {
            if (num % d == 0) {
                sum += d;
                int paired = num / d;
                if (paired != d) {
                    sum += paired;
                }
            }
        }
        return sum == num;
    }
}