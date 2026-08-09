class Solution {
    public int missingNumber(int[] nums) {
        int val =0;
        for (int x = 0; x < nums.length+1; x++) {
            val ^=x;
        }
        for(int x: nums)
        {
            val ^=x;
        }
        return val;
    }
}
