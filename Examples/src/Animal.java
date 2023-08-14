public class Animal {
    public static void main(String[] args) {
        System.out.println("1");
        Animal buzo=new Animal();
        buzo.eat();
        birds chki = new birds();
        chki.fly();
    }
    public void eat(){
        System.out.println("i am eating");
    }

}
class birds{
    void fly(){
        System.out.println("i am flying");
    }
}
