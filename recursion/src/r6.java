//count the digits of a given number using recursion
public class r6 {
    public static void main(String[] args) {
        int res = countDigits(123);
        System.out.printf("Total digits are: " + res);
    }
    public static int countDigits(int num) {
        if(num == 0) return 0;
        return 1+countDigits(num/10);
    }
}
