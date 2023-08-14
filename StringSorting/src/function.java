public record function() {
    public static void main(String[] args) {
        String s ="Hello world";
        System.out.println(s);
        System.out.println("lowercase = "+ s.toLowerCase());
        System.out.println("uppercase = "+s.toUpperCase());
        System.out.println("2 = " +s.charAt(2));
        System.out.println("add ="+s.concat(" Hello"));
        System.out.println("l index = "+s.indexOf('l'));
        System.out.println("is empty =" + s.isEmpty());
        System.out.println("length = "+s.length());
        System.out.println("remove space of corner ="+s.trim());
    }
}
