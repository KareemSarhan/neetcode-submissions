class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        HashSet<Integer> seq = new HashSet<>();
        for (int val : hs)
        {
            if(!hs.contains(val-1)) seq.add(val);
        }
        int max =0;
        for (int val : seq)
        {
            int seqVal=val;
            while(hs.contains(seqVal++)){}
            max = Math.max(max, seqVal-val-1);
        }

        return max;

    }
}
