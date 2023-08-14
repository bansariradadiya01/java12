import java.util.*;
public class BinarySearch_7 {
    public static void main(String[] args){
        int value;
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,4,6,9,11,34,65,67,988};
        int left=0;
        int right= arr.length-1;
        System.out.println("Enter the value = ");
        value = sc.nextByte();
        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==value){
                System.out.println("Present");
                return;
            } else if (value>arr[mid]) {
                left=mid+1;

            }else {
                right=mid-1;
            }
        }
        System.out.println("not Present");

    }
}
