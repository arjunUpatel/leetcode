import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            try{
            if (chr == ')' && stack.peek() != '(')
                return false;
            if (chr == '}' && stack.peek() != '{')
                return false;
            if (chr == ']' && stack.peek() != '[')
                return false;
            } catch(Exception e) {
                return false;
            }
            if (chr == ')' || chr == '}' || chr == ']')
                stack.pop();
            else
                stack.push(chr);
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }
}