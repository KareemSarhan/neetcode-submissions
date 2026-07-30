class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length<2) return nums.length;
        nums = Arrays.stream(nums)
                             .distinct()
                             .sorted()
                             .toArray();
        int max = 1;
        int localsum =1;
        for (int i = 0 ; i<nums.length-1;i++)
        {
            if (nums[i]==nums[i+1]-1)
            {
                localsum++;
                max= Math.max(max,localsum);
            }
            else{
                localsum = 1;
            }
        }
        return max;
    }
}
