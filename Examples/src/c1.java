//1) the java class called holidayis started below. an object of class holidayrepresents a holiday during the year.
// this class has three instance variables:
// ● name, which is a stringrepresenting the name of the holiday
// ● day, which is an intrepresenting the day of the month of the holiday
// ● month, which is a stringrepresenting the month the holiday is in
// public class holiday {
// private string name;
// private int day;
// private string month;
// your code goes here }
// a) write a constructor for the class holiday, which takes a stringrepresenting the name,
// an intrepresenting the day,
// and a stringrepresenting the month as its arguments,
// and sets the class variables to these values.
// b) write a method insamemonth, which compares two instances of the class holiday,and returns the boolean value trueif they have the same month, and falseif they do not.
// c) write a method avgdatewhich takes an array of base type holidayas its argument, and returns a doublethat is the average of the dayvariables in the holidayinstances in the array.
// you may assume that the array is full (i.e. does not have any null entries).
// d) write a piece of code that creates a holidayinstance with the name “independence day”, with the day “4”, and with the month “july”.
class Holiday{
    private String name;
    private int day;
    private String month;
    public Holiday(String name, int day,String month){
        this.name=name;
        this.day=day;
        this.month=month;

    }
    public boolean inSameMonth(Holiday h){

        return this.month.equals(h.month);
    }
    public static double avg(Holiday[] holiday){
        int sum=0;
        for (int i = 0; i < holiday.length; i++) {
            sum=sum+holiday[i].day;

        }return sum/holiday.length;
    }
}
public class c1{
    public static void main(String[] args) {
        Holiday h1 = new Holiday("r",9,"january");
        Holiday h2 = new Holiday("b",6,"january");
        Holiday h3= new Holiday("w",3,"march");
        System.out.println(h1.inSameMonth(h3));
        Holiday [] h = new Holiday[3];
        h[0]=h1;
        h[1]=h2;
        h[2]=h3;
        System.out.println(Holiday.avg(h));




    }
}