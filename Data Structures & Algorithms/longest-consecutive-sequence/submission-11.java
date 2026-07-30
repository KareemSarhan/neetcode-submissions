class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // Fast primitive sorting
        Arrays.sort(nums);
        
        int maxStreak = 1;
        int currentStreak = 1;
        
        for (int i = 1; i < nums.length; i++) {
            // Skip exact duplicates
            if (nums[i] != nums[i - 1]) {
                // If consecutive, increment the current streak
                if (nums[i] == nums[i - 1] + 1) {
                    currentStreak++;
                } else {
                    // Sequence broken, record max and reset
                    maxStreak = Math.max(maxStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }
        
        return Math.max(maxStreak, currentStreak);
    }
}