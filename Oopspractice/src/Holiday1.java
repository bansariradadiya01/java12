//1) The Java class called Holiday
//is started below. An object of class Holiday
//represents a
//holiday during the year. This class has three instance variables:
//● name
//, which is a String
//representing the name of the holiday
//● day
//, which is an int
//representing the day of the month of the holiday
//● month
//, which is a String
//representing the month the holiday is in
//public class Holiday {
//private String name;
//private int day;
//private String month;
//// your code goes here
//}
//a) Write a constructor for the class Holiday
//, which takes a String
//representing the name, an
//int
//representing the day, and a String
//representing the month as its arguments, and sets the
//class variables to these values.
//b) Write a method inSameMonth
//, which compares two instances of the class Holiday,
//and
//returns the Boolean value true
//if they have the same month
//, and false
//if they do not.
//c) Write a method avgDate
//which takes an array of base type Holiday
//as its argument, and
//returns a double
//that is the average of the day
//variables in the Holiday
//instances in the
//array. You may assume that the array is full (i.e. does not have any null entries).
//d) Write a piece of code that creates a Holiday
//instance with the name “Independence Day”,
//with the day “4”, and with the month “July”.
class holiday{
    private String name;
    private String month;
   private int day;

   public holiday(String name,String month,int day){
       this.month = month;
       this.day = day;
       this.name = name;
   }
   public void display(){
       System.out.println(name + " " + month + " " + day);
   }

   public boolean isSameMonth(holiday h ){
       return this.month.equals(h.month);

   }


    public static double avgDate(holiday[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i].day;
        }
        return sum/array.length;
    }
}

public class Holiday1 {
    public static void main(String[] args) {
        holiday h1 = new holiday("a","jan",2);
        holiday h2 = new holiday("b","feb",3);
        holiday h3 = new holiday("c","jan",4);

        h1.display();
        h2.display();
        h3.display();

        System.out.println( h1.isSameMonth(h2));
        System.out.println(h1.isSameMonth(h3));

        holiday[] h =new holiday[3];
        h[0]= h1;
        h[1]=h2;
        h[2]=h3;
        System.out.println("avg of the day = "+ holiday.avgDate(h));


    }
}

