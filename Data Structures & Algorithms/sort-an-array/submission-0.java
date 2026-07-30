class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(nums, l, m);
            mergeSort(nums, m + 1, r);
            merge(nums, l, m, r);
        }
    }
    public void merge(int[] nums, int l, int m, int r) {
        int L[] = Arrays.copyOfRange(nums, l, m + 1);
        int R[] = Arrays.copyOfRange(nums, m + 1, r + 1);

        int i = 0, j = 0, k = l;
        while (i < R.length && j < L.length) {
            if (R[i] >= L[j]) {
                nums[k++] = L[j++];
            } else {
                nums[k++] = R[i++];
            }
        }
        while (i < R.length) nums[k++] = R[i++];
        while (j < L.length) nums[k++] = L[j++];
    }
}