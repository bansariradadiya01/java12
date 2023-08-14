 class stringCompare {
        public static void main(String args[]) {
            int i, a = 1, len1, len2;
            String s1, s2;

            s1 = "hello how are you ";
            s2 = "hello hii";

            len1 = s1.length();
            len2 = s2.length();

            char str1[] = s1.toCharArray();
            char str2[] = s2.toCharArray();

            if (len1 == len2) {
                for (i = 0; i < len1; i++) {
                    if (str1[i] != str2[i]) {
                        a = 0;
                        break;
                    }
                }
            } else {
                a= 0;
            }
            if (a == 1) {
                System.out.println(" EQUAL");

            } else {
                System.out.println("NOT EQUAL");

            }
        }
    }
