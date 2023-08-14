public class ex {
    public static void main(String[] args) {
        int count=0;
        int temp = 0;
        int i;
        int[] arr = {1,10,1,1,1,4,5,6,8,7,8,5,1,10};
        for ( i =0; i < arr.length; i++) {
            int n=arr[0];
            if (arr[i]==n){
               count++;
               temp=count;

        }
        }

            if (temp>0) {
                int n=arr[0];
                System.out.println(n + "=" + temp);
           n = n + 1;
            }

        }
    }
