class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> HS = new HashSet<Integer>();
        for( int num : nums)
        {
            if (HS.contains(num))
                return true;
            else
                HS.add(num);
        }
        return false;
    }
}