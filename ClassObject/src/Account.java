class Account1{
    int number,balance,interest_rate,interest,totalAmount;
    String name;

    public Account1(int number, String name, int balance, int interest_rate) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.interest_rate = interest_rate;
        int interest=(balance*interest_rate*12 )/100;
        this.interest=interest;
        int totalAmount=balance+interest;
        this.totalAmount=totalAmount;
    }

    public void display(){
        System.out.println( number+" "+name+" "+balance+" "+interest_rate+" "+interest+" "+totalAmount);
    }


}
public class Account {
    public static void main(String[] args) {
        Account1 a1 = new Account1(1,"a",1000,2);
        Account1 a2 = new Account1(2,"b",3000,1);
        Account1 a3 = new Account1(3,"c",5000,2);

        a1.display();
        a2.display();
        a3.display();


    }
}
