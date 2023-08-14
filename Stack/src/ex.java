import java.util.*;
public class ex {
    public static void main(String[] args){
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A= ");
        int a =sc.nextInt();
        System.out.print("Enter the value of B= ");
        int b = sc.nextInt();
        System.out.println("Add = +");
        System.out.println("sub = -");
        System.out.println("multi = *");
        System.out.println("divi = /");
        String sym = sc.next();
        switch (sym){
            case "+":
                System.out.println("result is " + (a+b));
                break;
            case "-":
                System.out.println("result is " + (a-b));
                break;
            case "*":
                System.out.println("result is " + (a*b));
                break;
            case "/":
                System.out.println("result is " + (a/b));
                break;
            default:
                System.out.println("invalid symbol");
        }
    }
}
