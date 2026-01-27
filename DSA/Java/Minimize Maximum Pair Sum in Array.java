class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, nums[nums.length - 1 - i] + nums[i]);
        }
        return ans;
    }
}
