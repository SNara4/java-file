//11.program to demonstrate inherited interface
class account implements loan{
    int balance;

    public void getbalance() {
        System.out.println("account opened with 1000 rupees");
        balance=1000;}

    public int showbalance(int j) {
        balance=j;
        return j-250;}

    public int totalloan(int p, int t) {
        int amount=p+p*rate*t/100;
        if (balance*5<amount)
        {System.out.println("sorry loan cant be approved");
            return 0;}
        else
        {System.out.println("loan approved with amount of"+amount);
            return amount;}
    }
    public int si(int p,int t)
    {int si=totalloan(p,t)-p;
        return si;
    }

}
public class prog11 {
    public static void main(String[] args) {
        account a = new account();
        a.getbalance();
       System.out.println("available balance is"+ a.showbalance(2000));
       System.out.println("Loan status with si of :"+ a.si(3000,3));
    }
}