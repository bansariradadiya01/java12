import java.util.*;

//Print all the duplicate numbers in array
public class H7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5,5,6,3,1};
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i]+" ");
            }else {
                set.add(arr[i]);
            }
        }
       // System.out.println(set);
    }
}
