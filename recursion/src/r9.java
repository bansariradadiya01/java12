//find the sum of digits of a number using recursion
public class r9 {
    public static void main(String[] args) {
        sum(12345,0);
    }
    public static  void sum(int num,int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        int n=num%10;
        sum+=n;
        sum(num/10,sum);
    }
}
