class Solution {
    public int trap(int[] nums) {
        int waterVal = 0;
        int hLeft = nums[0];
        int hind=0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= hLeft) {
                for (int j = hind; j < i; j++) {
                    waterVal +=  Math.max(nums[j], hLeft)-nums[j];
                    nums[j] = Math.max(nums[j], hLeft);
                }
                hLeft = nums[i];
                hind=i;

            } else {
                for (int j = hind; j < i; j++) {
                    waterVal +=  Math.max(nums[j], nums[i])-nums[j];
                    nums[j] = Math.max(nums[j], nums[i]);
                }
            }
        }
        return waterVal;
    }

}
