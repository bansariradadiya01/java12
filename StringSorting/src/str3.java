public class str3 {
    public static void main(String[] args) {
        int count=0;
        String str = "hello world";
        System.out.println(str);
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ' || str.charAt(i)== ' '){
                count++;

            }

        }
        System.out.println(count);
    }
}
