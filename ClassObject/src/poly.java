class  bank{
    public int getIntrestRate(){
        return 4;
    }
}
class  bob extends bank{
    public int getIntrestRate(){
        return 5;
    }
}

public class poly {
    public static void main(String[] args) {
        bank b1= new bank();
        System.out.println(  b1.getIntrestRate());
        bob b2=new bob();
        System.out.println( b2.getIntrestRate());


        bank b;
        b=new bob();
        System.out.println( b.getIntrestRate());

    }
}
