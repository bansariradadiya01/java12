//calculate the product of two numbers using recursion.
public class r8 {
    public static void main(String[] args) {
        product(5,100,0);
    }
    public static void product(int x,int n,int pro){
        if(x<n) {
            int temp=x;
            x=n;
            n=temp;
        }
      if (n==0){
          System.out.println(pro);
          return;
      }
      pro+=x;
      product(x,n-1,pro);
    }
}
