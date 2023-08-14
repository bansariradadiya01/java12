//minimum find yhe path in the matrix
import static java.lang.Math.min;

public class matrix10 {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {8, 9, 10}};
        int row = matrix.length;
        int col = matrix[0].length;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (r == 0 && c == 0) {
                    matrix[r][c] =  matrix[r][c];
                } else if (r == 0)  {
                    matrix[r][c] = matrix[r][c] + matrix[r][c - 1];
                } else if (c == 0) {
                    matrix[r][c] = matrix[r][c] + matrix[r - 1][c];
                } else
                    matrix[r][c] = matrix[r][c] + min(matrix[r][c - 1], matrix[r - 1][c]);
            }
        }
        System.out.println(matrix[row - 1][col - 1]);
    }
}
