package A24_Bank;

public class Account {
  private double balance;
  private int id;
  private String holderName;
  private boolean zakatApplicable;


//Constructor
  public Account(double balance, int id, String holderName, boolean zakatApplicable) {
    this.balance = balance;
    this.id = id;
    this.holderName = holderName;
    this.zakatApplicable = zakatApplicable;
  }



  void deposit(double amount){
    balance=balance+amount;
  }

  void withDraw(double amount){
    balance=balance-amount;
  }

  void deductZakat(){
    balance-=balance*0.025;
  }

  public double getBalance() {
    return balance;
  }

  public String getHolderName() {
    return holderName;
  }
}
