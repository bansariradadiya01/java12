public class reverseArray {
    public static void main(String[] args) {
        String str = " How are you";
        int len = str.length();
        char[] charAraay = str.toCharArray();
        int left=0;
        int right = len-1;
        while (left<right){
            char temp= charAraay[left];
            charAraay[left]=charAraay[right];
            charAraay[right]=temp;
            left++;
            right--;
        }
        String revString = new String(charAraay);
        System.out.println(new String(charAraay));
    }
}
