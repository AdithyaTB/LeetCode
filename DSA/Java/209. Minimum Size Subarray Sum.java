class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, left = 0,n = nums.length, ans = nums.length + 1;
       
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return ans == n + 1 ? 0 : ans;
    }
}
