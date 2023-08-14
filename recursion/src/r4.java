//fibonacci siris
public class r4 {
    public static void main(String[] args) {
        fibo(0,1,7);
        System.out.println(fibo(5));
    }
    public static void fibo(int a,int b,int n){
        if(n==0) return;
        System.out.println(a);
        fibo(b,a+b,n-1);
    }
    public static int fibo(int n){
        if(n<2) return n;

        return fibo(n-1)+fibo(n-2);
    }
}
