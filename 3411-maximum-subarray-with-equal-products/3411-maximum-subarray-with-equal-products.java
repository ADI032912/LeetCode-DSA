class Solution {
    private static final int MAX_LCM_GCD_PRODUCT = 25200;

    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            int prod = 1;
            int gcdVal = 0;
            int lcmVal = 1;

            for (int j = i; j < n; j++) {
                int val = nums[j];

                if (prod > MAX_LCM_GCD_PRODUCT / val) {
                    break;
                }

                prod = prod * val;
                gcdVal = (j == i) ? val : gcd(gcdVal, val);
                lcmVal = lcm(lcmVal, val);

                if (prod == lcmVal * gcdVal) {
                    int currentLen = j - i + 1;
                    if (currentLen > maxLen) {
                        maxLen = currentLen;
                    }
                }
            }
        }

        return maxLen;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}