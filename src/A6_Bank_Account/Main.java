package A6_Bank_Account;

public class Main {
    public String name;
    public double balance;

    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Your Balance is:"+balance);
        if (balance>100000){
            balance=(amount*0.01)+balance;
            System.out.println("The New balance after adding 1% Bonus: "+balance);
        }
    }
    public void withdraw(double amount){
        balance=balance-amount;
        System.out.println("The Amount After WithDraw is:"+balance);
        if (balance<50000){
            balance=balance-(0.02*amount);
            System.out.println("The New balance after 2% deduction"+balance);
        }
    }
}
