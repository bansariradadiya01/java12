//sum of pair
import java.util.*;
public class H2 {
    public static void main(String[] args) {
        int[] arr={5,2,3,4,6};
        int sum=101;
     Set<Integer> set = new HashSet<>();
     for (int i=0;i<arr.length;i++){
         int diff=sum-arr[i];
         if(set.contains(diff)){
             System.out.println("pair is present");
             return;
         }
         set.add(arr[i]);
     }
        System.out.println("pair is not present");
    }
}
