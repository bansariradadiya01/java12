//get the largest element of array using recursion
public class r10 {
    static int max=0;
    public static void main(String[] args) {
      int[] arr={3,4,6,5};
      lar(arr,0);
    }
    public static void lar(int[] arr,int idx){
       if(idx== arr.length) {
           System.out.println(max);
           return;
       }
       if(max<arr[idx]){
           max=arr[idx];
       }
       lar(arr,idx+1);
    }
}
