class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                res[j + i * nums.length] = nums[j];
            }
        }
        return res;
    }
}