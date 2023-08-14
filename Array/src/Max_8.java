public class Max_8 {
    public static void main(String[] args){
        int arr[] = {2,3,5,4,1};
        int i;
        int max=arr[0];
        for ( i=1;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];

            }

        }
        System.out.println(max);
    }
}
