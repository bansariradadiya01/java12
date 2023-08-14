//check if a number is prime number or not
public class r11 {
    static int count=0;
    public static void main(String[] args) {
        prime(29,2);
    }
    public static void prime(int num,int i){
        if(i==num){
            System.out.println("num is prime");
            return;
        }if(num%i==0){
            System.out.println("num is not prime");
            return;
        }
        prime(num,i+1);
    }
}
