public class str7 {
    public static void main(String[] args) {
        String s1 = "good morning";
        char c='g';
        char str1[]=s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            if(str1[i]==c){
                System.out.print("G");
            }else {
                System.out.print(str1[i]);
            }

        }

    }
}
