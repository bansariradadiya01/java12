import java.util.Stack;

public class StackRevers {
    public static void main(String[] args) {
        Stack <Character> stack = new Stack<>();
        String s = "How are you";
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        }
    }