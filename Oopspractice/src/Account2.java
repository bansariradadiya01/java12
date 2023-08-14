class account{
    int accountnum, balance,i;
    String custname;

    static int rate=2;
    public account(int accountnum,String custname,int balance){
        this.accountnum=accountnum;
        this.custname=custname;
        this.balance=balance;
        int interest = balance*2/100;
         i= interest+balance;
    }
    public void display(){
        System.out.println(accountnum+" "+custname+" "+balance+" " +rate+" "+i);
    }

    public void interest(){

    }

}
public class Account2 {
    public static void main(String[] args) {
        account a1 = new account(1,"krinal",10000);
        account a2 = new account(2,"rency",5000);

        a1.display();
        a2.display();
    }
}
