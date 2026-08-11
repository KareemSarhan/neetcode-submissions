class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length==1) return 0;
        int [] l = new int [nums.length+1];
        int [] r = new int [nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            l[i+1]=l[i]+nums[i];
            r[nums.length-i-1]=r[nums.length-i]+nums[nums.length-i-1];
        }
        for(int i=0;i<l.length-1;i++)
        {
            if(l[i]==r[i+1]) return i;
        }
        return -1;
    }
}