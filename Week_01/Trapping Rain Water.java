class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        int max_left = 0, max_right = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] < max_left) {
                    ans += max_left - height[left];
                } else {
                    max_left = height[left];
                }
                left++;
            } else {
                if (height[right] < max_right) {
                    ans += max_right - height[right];
                } else {
                    max_right = height[right];
                }
                right--;
            }
        }
        return ans;
    }
}