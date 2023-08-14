public class M2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3,},{4,5,6},{7,8,9}};
        int n=3;
        int p=0;
        int s=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    p += arr[i][j];
                }  if ((i + j)==(n-1)) {
                    s += arr[i][j];

                }

            }

        }
        System.out.println(p+" ");
        System.out.println(s+" ");
    }
}