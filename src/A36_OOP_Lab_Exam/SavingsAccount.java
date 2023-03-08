package A36_OOP_Lab_Exam;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingBalance;

    SavingsAccount(){

    }
    public SavingsAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance =savingBalance;
    }

    public double calculateMonthlyInternet(){
        return getSavingBalance()*getAnnualInterestRate()/12;

    }
    public static void modifyInternetRate(double inputInternetRate){

    }
}
