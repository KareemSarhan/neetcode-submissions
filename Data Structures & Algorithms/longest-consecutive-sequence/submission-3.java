class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(Arrays.stream(nums).boxed().collect(Collectors.toList()));        
        HashSet<Integer> seq = new HashSet<>();
        for (int val : nums)
        {
            if(!hs.contains(val-1)) seq.add(val);
        }
        int max =0;
        for (int val : seq)
        {
            int seqVal=val;
            while(hs.contains(seqVal++)){}
            seqVal-=1;
            System.out.println(val);
            System.out.println(seqVal);
            System.out.println(max);

            max = Math.max(max, seqVal-val);
            System.out.println(max);
            System.out.println();


        }

        return max;

    }
}
