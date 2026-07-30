class Solution {
    public int trap(int[] nums) {
        int waterVal = 0;
        int l=0,r=nums.length-1;
        int lmax=0,rmax=0;
        while(l<r){
            if(lmax<nums[l]) lmax=nums[l];
            if(rmax<nums[r]) rmax=nums[r];
            waterVal += (Math.min(lmax,rmax) - nums[l])>0? (Math.min(lmax,rmax) - nums[l]) :0;
            waterVal += (Math.min(lmax,rmax) - nums[r])>0? (Math.min(lmax,rmax) - nums[r]) :0;
            if(nums[l]>nums[r]) r--;
            else l++;
        }
        return waterVal;
    }

}
