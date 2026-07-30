class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<right)
        {
            if (nums[right]+nums[left]==target)
            {
                return new int[]{left+1,right+1};
            }
            else if (nums[right]+nums[left]>target){
                right--;
            }
            else if (nums[right]+nums[left]<target){
                left++;
            }
        }

        return null;
    }
}
