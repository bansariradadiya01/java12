public class matrix08 {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int v=10;

        int col=matrix[0].length;
        for(int i=0;i<col;i++) {
            int left = 0, right = col - 1;
            while (left <= right){
                int mid = (left + right) / 2;
                if(matrix[i][mid] == v){
                    System.out.println("present");
                    return;
                }
                else if(v<matrix[i][mid]){
                    right=mid-1;
                } else
                    left=mid+1;

            }
        }
        System.out.println("not present");
    }
}