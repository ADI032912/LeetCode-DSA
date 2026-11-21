class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int expectedFreq = 0;
        for (int count : freq) {
            if (count > 0) {
                if (expectedFreq == 0) {
                    expectedFreq = count;
                } else if (count != expectedFreq) {
                    return false;
                }
            }
        }
        return true;
    }
}