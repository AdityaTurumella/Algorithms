package stack;

import java.util.Stack;
public class EvaluationOfPostfixExp {
    public static void main(String[] args) {
        String postfix ="100 200 + 2 / 5 * 7 +";
        evaluatePostfixExp(postfix);
    }

    private static void evaluatePostfixExp(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<postfix.length();i++){
            char c = postfix.charAt(i);
            if(c==' ')
                continue;
            else if(Character.isDigit(c)){
                int n=0;
                while (Character.isDigit(c)){
                    n=n*10+Character.getNumericValue(c);
                    i++;
                    c=(postfix.charAt(i));
                }
                i--;
                stack.push(n);
            }
            else{
                int y = stack.pop();
                int x = stack.pop();
                switch (c){
                    case '+':
                        stack.push(x+y);
                        break;
                    case '-':
                        stack.push(x-y);
                        break;
                    case '*':
                        stack.push(x*y);
                        break;
                    case '/':
                        stack.push(x/y);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }
}
