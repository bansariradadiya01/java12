class student{
    private int rollnum,mark1,mark2,mark3,totalmarks;
    private String studName;

    public student(int rollnum,String studName,int mark1,int mark2,int mark3){
        this.rollnum=rollnum;
        this.studName=studName;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        int totalmarks=mark1+mark2+mark3;
        this.totalmarks = totalmarks;
    }
    public void display(){
        System.out.println(rollnum + " " +studName+ " " +mark1+ " " +mark2+ " " +mark3+" "+totalmarks);
    }
}
public class student1 {
    public static void main(String[] args) {
        student s1=new student(1,"krinal",89,90,78);
        student s2=new student(2,"rency",81,93,71);
        student s3=new student(3,"prinal",80,90,70);

        s1.display();
        s2.display();
        s3.display();
    }
}
