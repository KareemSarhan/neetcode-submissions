class Solution {
    public int carFleet(int t, int[] pos, int[] sp) {
        int[][] pairs = new int[pos.length][2];
        for (int i = 0; i < pos.length; i++) pairs[i] = new int[] {pos[i], sp[i]};

        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < pos.length; i++) {
            pos[i] = pairs[i][0];
            sp[i] = pairs[i][1];
        }
        Stack<Double> st = new Stack<>();
        int fleets = 0;
        for (int i = sp.length-1; i >= 0; i--) {
            while (st.isEmpty() ||  st.peek() < (double)(t - pos[i]) /(double) sp[i]) {
                st.push((double)(t - pos[i]) /(double) sp[i]);
            }
        }

        return st.size();
    }
}
