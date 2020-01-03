import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()) {
                    stack.push(s.charAt(i));
                } else {
                    char inverse = getInverse(s.charAt(i));
                    if (!stack.isEmpty() && stack.peek() == inverse) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }

            }
        }
        return stack.isEmpty();
    }

    private static char getInverse(char item) {
        char result = '(';
        switch (item) {
            case '}':
                result = '{';
                break;
            case ']':
                result = '[';
                break;
            case ')':
                result = '(';
                break;
        }
        return result;
    }
}
