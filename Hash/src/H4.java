import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

// Majority element
public class H4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 4, 5, 1, 7, 3, 2,1, 5, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                map.put(arr[i], freq + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
      int Ele=0;
        int freq=0;
        for (Map.Entry<Integer,Integer> me : map.entrySet()){
            if(me.getValue()>freq){
                freq=me.getValue();
                Ele=me.getKey();
            }
        }
        System.out.println("Majority element = " + Ele);
    }
}