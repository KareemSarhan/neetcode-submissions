class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        int first, second;
        for (String s : tokens) {
            switch (s) {
                case ("+"):
                    first = Integer.decode(st.pop());
                    second = Integer.decode(st.pop());
                    st.push("" + (first + second));
                    break;
                case ("*"):
                    first = Integer.decode(st.pop());
                    second = Integer.decode(st.pop());
                    st.push("" + (first * second));
                    break;
                case ("-"):
                    first = Integer.decode(st.pop());
                    second = Integer.decode(st.pop());
                    st.push("" + (second - first));

                    break;
                case ("/"):
                    first = Integer.decode(st.pop());
                    second = Integer.decode(st.pop());
                    st.push("" + (second / first));
                    break;
                default:
                    st.push(s);
                    break;
            }
        }
        return Integer.decode(st.pop());
    }
}
