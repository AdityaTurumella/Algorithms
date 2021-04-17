package stack;
import java.util.Stack;
public class ParentheisCheck {
    public static void main(String[] args) {
        String s = "}";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
                if (c == '}' || c == ']' || c == ')') {
                    if (!stack.isEmpty()) {
                        if (stack.peek() == '(' && c == ')' || stack.peek() == '{' && c == '}' || stack.peek() == '[' && c == ']') {
                            stack.pop();
                        } else {
                            break;
                        }
                    }
                    else {
                        stack.push(c);
                        break;
                    }
                }

        }
        if(stack.isEmpty()){
            System.out.println("VALID");
        }
        else{
            System.out.println("INVALID");
        }


    }
}
