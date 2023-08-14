public class NumFind_4 {
    public static void main(String[] args){
        int n=6;
        int arr[] = {1,4,1,3,6,2,5};
        int sum =n*(n+1)/2;
        int sum2 = 0;
        for (int i=0;i<=n;i++){
            sum2=sum2+arr[i];
        }
        System.out.println(sum2-sum);
    }
}
