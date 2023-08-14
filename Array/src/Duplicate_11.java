import java.util.*;
public class Duplicate_11 {
    public static void main(String[] args){
        int arr[]={1,4,6,2,4,8,2,9};
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value = ");
        int value = sc.nextInt();
        for (int i =0;i< arr.length;i++){
            if (arr[i] == value){
                if (count == 1){
                    System.out.println("Duplicate");
                    return;
                }
                count++;
            }


        }
        System.out.println("Not Duplicate");

    }
}
