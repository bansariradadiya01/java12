class person{
    int age;
    String name;
}
class pro extends person{
    int id;
    int salary;

}

class student extends pro{
    int rollno;
    int sem;
}


public class singleInheritance {
    public static void main(String[] args) {
        pro data = new pro();
        data.id=1;
        data.name="krinal";
        data.age=20;
        data.salary=10000;
        System.out.println(data.id+" "+data.name+" "+data.age+" "+ data.salary);
        System.out.println();
        student d1 = new student();
        d1.rollno=1;
        d1.name="radha";
        d1.age=18;
        d1.sem=6;
        d1.salary=5000;
        System.out.println(d1.rollno+" "+d1.name+" "+d1.age+" "+ d1.sem+" "+data.salary);


    }
}
