class Solution {
    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }
    public int findMin(int[] nums, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                if (nums[mid] < nums[left]) {
                    return Math.min(nums[mid], findMin(nums, left, mid - 1));
                } else if (nums[mid] >= nums[left]) {
                    return nums[left];
                }
            } else if (nums[mid] > nums[right]) {
                if (nums[mid] < nums[left]) {
                    return findMin(nums, left, mid - 1);
                } else if (nums[mid] >= nums[left]) {
                    return Math.min(nums[left], findMin(nums, mid + 1, right));
                }
            }
        }
        return nums[right];
    }
}
