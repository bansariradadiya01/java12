public class M1 {
    public static void main(String[] args) {
        int col=3;
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i]);
            System.out.println(arr[i][col-i-1]);

        }
    }
}
