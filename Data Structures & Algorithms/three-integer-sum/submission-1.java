class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> res =  new HashSet<>();
        for(int i =0;i<nums.length;i++)
        {

            int left = i+1;
            int right = nums.length-1;
            int target = -nums[i];
            while(left<right)
            {
                if (nums[right]+nums[left]==target)
                {
                    res.add( List.of(-target,nums[left],nums[right]));
                    right--;
                    left++;
                }
                else if (nums[right]+nums[left]>target){
                    right--;
                }
                else if (nums[right]+nums[left]<target){
                    left++;
                }
            }
        }

        return res.stream().collect(Collectors.toList());
    }
}