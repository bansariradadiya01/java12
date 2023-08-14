public class Pointer0101_13 {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 0, 0, 1, 0};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            } else if (arr[left] == 0 && arr[right] == 1) {
                left++;
                right--;

            } else if (arr[left] == 0) {
                left++;
            } else {
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
