class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int hVal = 0;
        while(left<right)
        {
            hVal = Math.max(hVal,Math.min(nums[right],nums[left]) * (right-left));
            if (nums[right]>nums[left]){
                left++;
            }
            else {
                right--;
            }
        }
        return hVal;
    }
}
