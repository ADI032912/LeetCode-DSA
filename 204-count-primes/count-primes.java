class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        boolean[] b1 = new boolean[n];
        for (int i = 2; i < n; i++) {
            b1[i] = true;
        }
        for (int p = 2; p * p < n; p++) {
            if (b1[p]) {
                for (int i = p * p; i < n; i += p) {
                    b1[i] = false;
                }
            }
        }
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (b1[i]) {
                c++;
            }
        }
        return c;
    }
}