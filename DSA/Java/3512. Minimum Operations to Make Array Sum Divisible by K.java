class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
             cnt += nums[i];
        }
        return cnt % k;
    }
}
