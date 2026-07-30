class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int hRight = nums[right];
        int hLeft = nums[left];
        int hVal = Math.min(hRight,hLeft) * (right-left);
        while(left<right)
        {
            if (nums[left]>hLeft){
                hLeft = nums[left];
            }
            if (nums[right]>hRight){
                hRight = nums[right];
            }
            if(hVal < Math.min(hRight,hLeft) * (right-left)){
                hRight = nums[right];
                hLeft = nums[left];
                hVal = Math.min(hRight,hLeft) * (right-left);
            }
            if (nums[right]>nums[left]){
                left++;
            }
            else if (nums[right]<nums[left])
            {
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        return hVal;
    }
}
