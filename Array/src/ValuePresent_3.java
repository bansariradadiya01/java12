public class ValuePresent_3 {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,3};
        int value = 1;
        for (int i=0 ; i<arr.length ; i++){
            if(arr[i] == value) {
                System.out.println("value is present");
             return;
            }
        }
        System.out.println("value is not present");

    }
}






