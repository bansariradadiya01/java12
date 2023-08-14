//sorted matrix find the element
public class matrix06 {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int v=6;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(v==matrix[i][j]){
                    System.out.println(v);
                    return;
                }

            }
        }
        System.out.println("not found");
    }
}