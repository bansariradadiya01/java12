//count frequency of number
import java.util.HashMap;
import  java.util.*;
public class H3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,4,5,1,7,3,2,5,5,5};
     Map<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<arr.length;i++){
     if(map.containsKey(arr[i])) {
         int freq=map.get(arr[i]);
         map.put(arr[i],freq+1);
              } else {
         map.put(arr[i],1);
     }
         }
        System.out.println(map);
     for (Map.Entry<Integer,Integer> me :map.entrySet()){
         System.out.println(me.getKey()+"="+me.getValue());
     }

    }
}
