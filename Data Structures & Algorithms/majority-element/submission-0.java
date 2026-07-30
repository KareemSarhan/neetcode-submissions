class Solution {
    public int majorityElement(int[] nums) {
        int cand= nums[0];
        int score = 0;
        for (int i =0;i<nums.length;i++)
        {
            if(cand==nums[i])
            {
                score++;
            }
            else if (score ==0)
            {
                cand = nums[i];
                score++;
            }
            else{
                score--;
            }
        }
        return cand;
    }
}