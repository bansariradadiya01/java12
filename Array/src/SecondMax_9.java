public class SecondMax_9 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 1, 32, 6, 34, 45, 1,40,894};
        int max1 = arr[0];
        int max2 = arr[1];
        if(arr[0] > arr[1]){
            max1=arr[0];
            max2=arr[1];
        }else {
            max1=arr[1];
            max2=arr[0];
        }
        for (int i =2;i< arr.length;i++){
            {
                if (arr[i]>max1){
                    max2=max1;
                    max1=arr[i];
                } else if (arr[i]>max2) {
                    max2=arr[i];
                }

            }
        }
        System.out.println(max2);
    }
}
