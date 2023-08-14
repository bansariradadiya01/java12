import java.util.*;
public class Unique_12 {
    public static void main(String args[]){
        int[] arr = {2,4,6,2,4,3,9,15,12,15};
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value = ");
        int value = sc.nextInt();
        for (int i = 0;i< arr.length;i++){
            if (arr[i] == value){
                if (count == 1){
                    System.out.println("Not Unique");
                    return;
                }
                count++;
            }
        }
        System.out.println("Unique");
    }
}
