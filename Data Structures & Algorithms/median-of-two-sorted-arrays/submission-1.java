class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        if (A.length == 0)
            return B.length % 2 == 0 ? (B[B.length / 2] + B[B.length / 2 - 1]) / 2.0
                                     : B[B.length / 2];
        if (B.length == 0)
            return A.length % 2 == 0 ? (A[A.length / 2] + A[A.length / 2 - 1]) / 2.0
                                     : A[A.length / 2];
        int[] temp = A;
        if (A.length > B.length) {
            A = B;
            B = temp;
        }
        int l = 0, r = A.length;
        int tot = A.length + B.length;
        int half = (tot + 1) / 2;
        while (l <= r) {
            int mid1 = (r + l) / 2;
            int mid2 = half - mid1;
            int Aleft = mid1 > 0 ? A[mid1 - 1] : Integer.MIN_VALUE;
            int Aright = mid1 < A.length ? A[mid1] : Integer.MAX_VALUE;
            int Bleft = mid2 > 0 ? B[mid2 - 1] : Integer.MIN_VALUE;
            int Bright = mid2 < B.length ? B[mid2] : Integer.MAX_VALUE;
            if (Aleft <= Bright && Bleft <= Aright) {
                return tot % 2 == 0 ? (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0
                                    : Math.max(Aleft, Bleft);
            } else if (Aleft > Bright) {
                r = mid1 - 1;
            } else {
                l = mid1 + 1;
            }
        }
        return 0;
    }
}
