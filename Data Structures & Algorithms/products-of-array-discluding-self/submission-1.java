class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] postProd = new int[nums.length];
        int[] preProd = new int[nums.length];
        preProd[0] = nums[0];
        postProd[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length-1; i++) {
            preProd[i] = preProd[i-1] * nums[i];
            postProd[nums.length - i - 1] = nums[nums.length - i - 1] * postProd[nums.length - i];
        }

        int[] resProd = new int[nums.length];
        resProd[0] = postProd[1];
        resProd[nums.length-1] = preProd[nums.length-2];
        
        for (int i = 1; i < nums.length-1; i++) {

            resProd[i] = preProd[i-1] * postProd[i+1];
        }

        return resProd;
    }
}
