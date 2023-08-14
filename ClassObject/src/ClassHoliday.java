class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public void display() {
        System.out.println(name + " " + day + " " + month);
    }

    public boolean isSameMonth(Holiday h) {
        return this.month.equals(h.month);
    }

    public static double avg(Holiday[] holidays){
        int sum=0;
        for (int i = 0; i < holidays.length; i++) {
            sum=sum+holidays[i].day;

        }return  sum/holidays.length;
    }

}

    public class ClassHoliday {
        public static void main(String[] args) {
            Holiday h1 = new Holiday("A", 3, "January");
            Holiday h2 = new Holiday("B", 2, "January");
            Holiday h3 = new Holiday("C", 4, "March");

            h1.display();
            h2.display();
            h3.display();

            System.out.println("h1 equals h2 = "+h1.isSameMonth(h2));
            System.out.println("h1 equals h3 = "+h1.isSameMonth(h3));

            Holiday[] h = new Holiday[3];
            h[0]=h1;
            h[1]=h2;
            h[2]=h3;
            System.out.println("avg of days = "+Holiday.avg(h));

        }

    }
