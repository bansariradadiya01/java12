public class Pair_5 {
public static void main(String[] args){
    int arr[]={1,5,3,7,5,7,2,9};
    int value=12;
    for(int i=0;i<arr.length-1;i++){
        for (int j=i+1;j<arr.length;j++){
            if (arr[i] + arr[j] == value){
                System.out.println("pair is present");
                return;
            }
        }
    }
    System.out.println("pair is not present");
}
}
