//subset
import java.util.*;
public class H1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 6, 7, 8, 9};
        int[] arr2 = {1, 4, 3,5};
       Set<Integer> set = new HashSet<>();
       for(int i=0;i<arr1.length;i++) {
           set.add(arr1[i]);
       }
       for(int i=0;i<arr2.length;i++){
           if(!set.contains(arr2[i])){
               System.out.println("not subset");
               return;
           }
        }
        System.out.printf("subset");
    }
}


