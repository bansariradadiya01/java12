import java.util.*;
public class ValueCount_14 {
    public static void main(String[] args) {
        //
        int arr[]={1,2,4,6,7,1,1,9,2,4,2,1};
        int TempArr[]= new int[11];

        for (int i=0;i<arr.length;i++) {
            TempArr[arr[i]]= TempArr[arr[i]]+1;

        }
        for (int i=0;i< TempArr.length;i++){
            if (TempArr[i]>0) {
                System.out.println(i + "=" +TempArr[i]);
            }
        }


    }
}
