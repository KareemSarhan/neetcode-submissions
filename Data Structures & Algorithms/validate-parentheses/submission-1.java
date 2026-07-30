class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
        }
        for (Character c : s.toCharArray()) {
            switch (c) {
                case '(', '{', '[':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.isEmpty())
                        return false;
                    if (stack.pop() != '{')
                        return false;
                    break;
                case ')':
                    if (stack.isEmpty())
                        return false;

                    if (stack.pop() != '(')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty())
                        return false;

                    if (stack.pop() != '[')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
