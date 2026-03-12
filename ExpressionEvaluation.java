import java.util.*;

public class ExpressionEvaluation {

    public static int precedence(char op) {
        if(op == '+' || op == '-') return 1;
        if(op == '*' || op == '/') return 2;
        return 0;
    }

    public static int applyOperator(int a, int b, char op) {
        switch(op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }

    public static int evaluate(String expression) {

        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for(int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if(Character.isDigit(ch)) {
                values.push(ch - '0');
            }

            else if(ch == '(') {
                ops.push(ch);
            }

            else if(ch == ')') {

                while(ops.peek() != '(') {
                    int b = values.pop();
                    int a = values.pop();
                    char op = ops.pop();
                    values.push(applyOperator(a,b,op));
                }
                ops.pop();
            }

            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {

                while(!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) {
                    int b = values.pop();
                    int a = values.pop();
                    char op = ops.pop();
                    values.push(applyOperator(a,b,op));
                }
                ops.push(ch);
            }
        }

        while(!ops.isEmpty()) {
            int b = values.pop();
            int a = values.pop();
            char op = ops.pop();
            values.push(applyOperator(a,b,op));
        }

        return values.pop();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String exp = sc.next();

        int result = evaluate(exp);

        System.out.println("Result = " + result);
    }
}