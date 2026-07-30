class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int max =0;

        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }

        for (int val : hs)
        {
            if(!hs.contains(val-1)) {
                int seqVal=val;
                while(hs.contains(seqVal++)){}
                max = Math.max(max, seqVal-val-1);
            }
        }

        return max;

    }
}
