public class matrix09 {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{8,9,10}};
        int row = matrix.length;
        int col=matrix[0].length;
        int top=0;
        int bottom=row-1;
        int value=7;
        int rowofsearch=-1;
        while(top<=bottom) {
            int mid = (top + bottom) / 2;
            if (value >= matrix[mid][0]&&value <= matrix[mid][col-1]) {
                rowofsearch=mid;
                break;

            } else if (value > matrix[mid][0]) {
                top=mid+1;
            }
            else{
                bottom=mid-1;
            }

        }
        if(rowofsearch==-1){
            System.out.println("value not present");
            return;
        }
        int left=0;
        int right=col-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(value==matrix[rowofsearch][mid]){
                System.out.println("value is present");
                return;
            } else if (value>matrix[rowofsearch][mid]) {
                left=mid+1;

            }
            else{
                right=mid-1;
            }

        }
        System.out.println("not present");

    }
}