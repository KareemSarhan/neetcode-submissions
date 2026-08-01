class Solution {
    public int largestRectangleArea(int[] h) {
        int max = 0;
        for (int i = 0; i < h.length; i++) {
            int temp = h[i];
            for (int j = i + 1; j < h.length && h[j] >= h[i]; j++) temp += h[i];
            for (int k = i - 1; k >= 0 && h[k] >= h[i]; k--) temp += h[i];
            max = Math.max(max,temp);
        }
        return max;
    }
}
