public class InsertUpdateDelete_15 {
        public static void main(String[] args) {
            int[] arr = new int[10];
            int length = 0;
            System.out.println("isEmpty: " + isEmpty(length));
            length = insert(arr, length, 10);
            length = insert(arr, length, 20);
            length = insert(arr, length, 30);
            length = insert(arr, length, 40);
            System.out.println("Before update");
            display(arr, length);
            update(arr, length, 20, 200);
            System.out.println("\nAfter update");
            display(arr, length);
            System.out.println("\nAfter delete");
            length = delete(arr, length, 200);
            display(arr, length);
            System.out.println("\nsize: " + size(length));
            System.out.println("isEmpty: " + isEmpty(length));
            find(arr,length,10);

        }
    private static void find(int arr[] , int length,int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value){
                System.out.println("present");
                return;
            }

        }
        System.out.println("not present");
    }
    private static boolean isEmpty(int length) {
        if (length < 1) {
            return true;
        }
        return false;
    }

    private static int size(int length) {
        return length;
    }

    private static int delete(int[] arr, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == value) {
                int j = i;
                for (; j < length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                length--;
            }
        }
        return length;
    }

    private static void update(int[] arr, int length, int value1, int value2) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == value1) {
                arr[i] = value2;
                return;
            }
        }
        System.out.println("Value not present");
    }

    private static int insert(int[] arr, int l, int value) {
        if (l == arr.length) {
            System.out.println("Array if full");
            return l;
        }
        arr[l] = value;
        l++;
        return l;
    }

    private static void display(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }
