import java.util.*;

//count pairs with given sum
public class H6 {
    public static void main(String[] args) {
        int[] arr={5,2,3,1,4,6,0,2,3};
        int sum=5;
        int count=0;
       Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff=sum-arr[i];
            if (map.containsKey(diff)){
                count=count+map.get(diff);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(count);
    }
}
