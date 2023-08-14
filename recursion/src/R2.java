//Calculate the factorial of a number
public class R2 {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }
    public static int fact(int count){
        if(count==1) return 1;
        return count*fact(count-1);
    }
}
