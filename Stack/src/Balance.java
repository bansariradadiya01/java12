import java.util.Stack;

public class Balance {
    public static void main(String[] args){
        String str = "{[()]}";
        Stack<Character>stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if (ch == '{'||ch=='['||ch=='(') {
                stack.push(ch);
            }
            else {
                char a = stack.pop();
                if ((a=='{' && ch=='}') || (a=='[' && ch==']') || (a=='(' && ch==')')){
                    continue;
                }
                else {
                    System.out.println("not balanced");
                    return;
                }
            }


        }
        if (stack.isEmpty()){
            System.out.println("balanced");
        }else {
            System.out.println("not balanced");
        }

    }
}
