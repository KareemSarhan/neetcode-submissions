class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            res = map.getOrDefault(target - nums[i], -1);
            map.put(nums[i], i);
            if (res != -1)
                return new int[] {res, i};
        }

        return new int[] {};
    }
}