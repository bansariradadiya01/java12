//print the array elements using recursion
public class r5 {
    public static void main(String[] args) {
        int[] arr={2,3,5,4,6};
        print(arr, arr.length-1);
        System.out.println("second");
        p(arr,0);
    }
    public static void print(int[] arr,int idx){
        if (idx== -1) return;
        print(arr, idx-1);
        System.out.println(arr[idx]);
    }
    public static void p(int[] arr,int idx){
        if(idx== arr.length) return;
        System.out.println(arr[idx]);
        p(arr,idx+1);

    }
}
