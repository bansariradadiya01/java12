//class student3{
//    int rollno,marks1,marks2,marks3;
//    String name;
//
//    public student3(int rollno,String name,int marks1,int marks2,int marks3){
//        this.rollno=rollno;
//        this.name=name;
//        this.marks1=marks1;
//        this.marks2=marks2;
//        this.marks3=marks3;
//    }
//    public void display(){
//        System.out.println(rollno+" "+name+" "+marks1+" "+marks2+" "+marks3);
//    }
//    public void gettop3(student[] array){
//        int percentage=(marks1+marks3+marks2)/3;
//        System.out.println(percentage);
//       int temp = 0;
//        for (percentage = 0;percentage>array.length;percentage++){
//            if(percentage>temp){
//                temp = percentage;
//                percentage++;
//            }else {
//            return temp;
////        }
//    }
//}
//public class student4 {
//    public static void main(String[] args){
//        student3 s1 = new student3(1,"krinal",90,80,70);
//        student3 s2 = new student3(2,"rinal",94,82,71);
//        student3 s3 = new student3(3,"prinal",50,84,78);
//        s1.display();
//        s2.display();
//        s3.display();
//
//        s1.gettop3();
//
//        student3[] h = new student3[3];
//        h[0]=s1;
//        h[1]=s2;
//        h[2]=s3;
//
//    }
//}
