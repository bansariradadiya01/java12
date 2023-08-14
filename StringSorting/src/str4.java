public class str4 {
    public static void main(String[] args) {
        String str = "hello world";
                char[] array = str.toCharArray();
                System.out.println(  str);
                System.out.print("Duplicate Characters = ");
                for (int i = 0; i < str.length(); i++) {
                    for (int j = i + 1; j < str.length(); j++) {
                        if (array[i] == array[j]) {
                            System.out.print(array[j] + " ");
                            break;
                        }
                    }
                }
            }
        }

