class student1 {
    int rollno;
    static int unumber = 0;
    int marks[] = new int[3];

    public student1(int rollno, int m1, int m2, int m3) {
        this.rollno = rollno;
        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;

    }

    public void display() {
        System.out.println(rollno + " " + marks[0] + " " + marks[1] + " " + marks[2]);
    }

    public int gethigh() {
        int max = 0;
        for (int i = 0; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
            }

        }
        return max;
    }

    public int getlow(){
        int low=marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (low>marks[i]){
                low=marks[i];
            }

        }
        return low;
    }

    public int total(){
        int sum=0;
        for (int i = 0; i < marks.length; i++) {
            sum=sum+marks[i];

        }
        return sum;
    }

    public int getavg(){
        int sum=0;
        for (int i = 0; i < marks.length; i++) {
            sum=sum+marks[i];

        }
        return sum/ marks.length;
    }
    public void input(){
        unumber++;
        rollno=unumber;
        System.out.println(rollno);
    }
    public int passcount(){
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]>50){
                count++;
            }
        }
        return count;
    }

}
public class StudentC {
    public static void main(String[] args) {
        student1 s = new student1(1,70,50,60);
        student1 s1 = new student1(2,70,50,60);
        student1 s2 = new student1(3,70,50,60);


        s.display();
        System.out.println("passcount = "+ s.passcount());
        System.out.println("low = "+s.getlow());
        System.out.println("high = "+s.gethigh());
        System.out.println("total = "+s.total());
        System.out.println("avg = "+s.getavg());
        s.input();
        s1.input();
        s2.input();
    }
}
