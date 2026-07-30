class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int hRight = nums[right];
        int hLeft = nums[left];
        int hVal = Math.min(hRight,hLeft) * (right-left);
        while(left<right)
        {
            if(hVal < Math.min(nums[right],nums[left]) * (right-left)){
                hVal = Math.min(nums[right],nums[left]) * (right-left);
            }
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
