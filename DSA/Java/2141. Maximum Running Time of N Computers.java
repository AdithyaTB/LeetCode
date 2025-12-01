class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long minBatt = Long.MAX_VALUE;
        long sum = 0;
        for (int i : batteries){
            minBatt = Math.min(minBatt, i);
            sum += i;
        }
        long minBatteries = minBatt;
        long totalEnergy = sum / n;
        long res = 0;
        while (minBatteries <= totalEnergy){
            long mid = (minBatteries + totalEnergy) >> 1;
            long total = 0;
            for (long b : batteries){
                total += Math.min(b, mid);
            }
            if (total >= mid * n){
                res = mid;
                minBatteries = mid + 1;
            } else {
                totalEnergy = mid - 1;
            }
        }
        return res;
    }
}
