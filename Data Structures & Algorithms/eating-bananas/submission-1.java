class Solution {
     public int minEatingSpeed(int[] nums, int h) {
        int extras = h - nums.length;
        int kmin = 1;
        int k = 1;
        int kmax = Arrays.stream(nums).max().getAsInt();
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = nums.length - 1; i >= 0; i--) {
                int val = extras - (int) Math.ceil((double) nums[i] / (double) k - 1);
                if (val < 0) {
                    kmin = k + 1;
                    k = kmin + (kmax - kmin) / 2;
                    extras =  h - nums.length;
                    flag = true;
                    break;
                } else extras = val;
            }
            if (flag == false && k != kmax) {
                kmax = k;
                k = kmin + (kmax - kmin) / 2;
                extras = h - nums.length;
                flag = true;
            }
        }

        return k;
    }
}
