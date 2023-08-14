//Infinitive recursive function
public class R1 {
    public static void main(String[] args) {
        Hello();
    }
    private static void Hello(){
        System.out.println("Hello world");
        Hello();
    }
}
