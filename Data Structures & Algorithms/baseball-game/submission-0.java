class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        for (String str : ops) {
            switch (str) {
                case "D":
                    s.push(s.peek() * 2);
                    break;
                case "C":
                    s.pop();
                    break;
                case "+":
                    int top = s.pop();
                    int top2 = s.peek();
                    s.push(top);
                    s.push(top + top2);
                    break;
                default:
                    s.push(Integer.valueOf(str));
            }
        }
        int tot = 0;
        while (!s.isEmpty()) tot += s.pop();
        return tot;
    }
}