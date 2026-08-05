class Solution {
    public int maxProfit(int[] nums) {
        int l = 0, r = 1, max = 0;
        while (l < r && r < nums.length) {
            if (nums[l] > nums[r]) {
                l = r;
            } else {
                max = Math.max(max, nums[r] - nums[l]);
            }
            r++;
        }
        return max;
    }
}
