//reverse an integer number using recursion
public class r7 {
    public static void main(String[] args) {
       rev(123);
       r(123579,0);
    }
    public static void rev(int num){
        if(num<10){
            System.out.print(num);
            return;
        }else {
            System.out.print(num%10);
            rev(num/10);
        }
        System.out.println();
    }
    public static void r(int num,int revno){
        if(num==0){
            System.out.println(revno);
            return ;
        }
        int n=num%10;
         revno=revno*10+n;
         r(num/10,revno);
    }
}
