public class PairWhile_6 {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8};
        int value  = 5;
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            if (arr[left] + arr[right] == value) {
                System.out.println("pair is present");
                return;
            } else if (arr[left] + arr[right] < value) {
                left++;
            }else {
                right--;
        }
        }
        System.out.println("pair is not present");
    }
}
