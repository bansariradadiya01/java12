import java.util.Stack;

public class String1 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "How are you";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' '){
                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
            else {
                stack.push(str.charAt(i));
            }

        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
