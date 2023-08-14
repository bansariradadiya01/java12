//sum of matrix element
//traversal row and column
//count row and column size
public class matrix01 {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                sum = sum + matrix[i][j];
                System.out.print(matrix[j][i]);

            }
            System.out.println();
        }System.out.println(sum);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);



    }
}