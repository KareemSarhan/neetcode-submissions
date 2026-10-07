class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int lastMax = 0;
        int curMax = 0;
        for (int i : nums) {
            if (i == 0) {
                lastMax = curMax > lastMax ? curMax : lastMax;
                curMax = 0;
            } else
                curMax++;
        }
        return curMax > lastMax ? curMax : lastMax;
    }
}