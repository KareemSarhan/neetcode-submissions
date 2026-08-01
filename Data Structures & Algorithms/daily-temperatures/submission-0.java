class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Stack<Integer> st = new Stack<>();
        int [] res = new int[temps.length];
        for (int i= 0;i<temps.length;i++)
        {
            while(!st.isEmpty() && temps[st.peek()]<temps[i]){
                res[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        return res;
    }
}
