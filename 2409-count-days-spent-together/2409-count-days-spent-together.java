class Solution {
    private static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aStart = toDayOfYear(arriveAlice);
        int aEnd = toDayOfYear(leaveAlice);
        int bStart = toDayOfYear(arriveBob);
        int bEnd = toDayOfYear(leaveBob);
        int overlapStart = Math.max(aStart, bStart);
        int overlapEnd = Math.min(aEnd, bEnd);
        return Math.max(0, overlapEnd - overlapStart + 1);
    }
    private int toDayOfYear(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += DAYS[i];
        }
        return totalDays;
    }
}