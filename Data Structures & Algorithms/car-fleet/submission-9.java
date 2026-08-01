class Solution {
    public int carFleet(int t, int[] pos, int[] sp) {
        int[][] pairs = new int[pos.length][2];
        for (int i = 0; i < pos.length; i++) pairs[i] = new int[] {pos[i], sp[i]};

        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < pos.length; i++) {
            pos[i] = pairs[i][0];
            sp[i] = pairs[i][1];
        }
        double steps = (t - pos[pos.length - 1]) / sp[pos.length - 1];
        int total = 0;
        int partial = 0;
        Stack<Integer> st = new Stack<>();
        int fleets = 0;
        for (int i = sp.length-1; i >= 0; i--) {
            boolean flag = false;
            while (!st.isEmpty() && (double)(t - pos[st.peek()]) / (double) sp[st.peek()] < (double)(t - pos[i]) /(double) sp[i]) {
                st.pop();
                fleets += st.isEmpty()? 1:0;
            }
            st.push(i);
        }

        return fleets + (st.size() > 0 ? 1 : 0);
    }
}
