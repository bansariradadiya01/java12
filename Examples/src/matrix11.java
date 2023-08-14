// delete greatest value in each row
public class matrix11 {
    public static void main(String[] args) {

        int[][] mat = {{1,6,8,8}, {6,3,5,8}, {6,3,5,4}, {1,2,4,1}};
        int row = mat.length;
        int col = mat[0].length;
        int delPoint ;

        for (int i = 0; i < row; i++) {
            delPoint = 0;
            for (int j = 1; j < col; j++) {
                if(mat[i][delPoint] < mat[i][j]){
                    delPoint = j;
                }

            }
            for (int k = delPoint; k < col - 1; k++) {
                mat[i][k] = mat[i][k+1];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col-1; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}