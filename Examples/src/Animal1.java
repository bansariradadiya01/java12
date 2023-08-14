public class Animal1 {
    static class Animal {
        int age;
        String color;
        void initObj(String c , int a){
            color=c;
            age=a;

        }
        void display(){
            System.out.println(color+" "+age);
        }

        public static void main(String[] args) {
            Animal buzo = new Animal();
            buzo.initObj("black",15);
            buzo.display();
         //  buzo.color = "black";
         //  buzo.age = 12;
         //  System.out.println(buzo.color+" "+buzo.age);
        }
    }
}