class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0 , r, maxCount = 0, zeros = 0;
        for( r = 0; r < nums.length ; r++ ){
            if(nums[r] == 0){
                zeros++;
            }
            while (zeros > 1){
                if(nums[l] == 0){
                    zeros -= 1;
                }
                l++;
            }
            maxCount = Math.max(maxCount , r-l);
        }
        return maxCount;
    }
}
