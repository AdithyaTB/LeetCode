class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left <= right) {
            int width = right - left;
            int minheight = Math.min(height[right], height[left]);
            int area = width * minheight;

            maxArea = Math.max(area, maxArea);

            if (height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
