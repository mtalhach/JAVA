package A36_OOP_Lab_Exam;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount account=new SavingsAccount();

        account.setSavingBalance(250);
        account.setAnnualInterestRate(1750);

        double interest=account.calculateMonthlyInternet();
        System.out.println();
        System.out.println("Monthly Interest: "+interest);
        System.out.println("============================");
        System.out.println();
        double saving= account.getSavingBalance()+interest;
        System.out.println("Saviing Balance after Adding interest Rate: "+saving);
        System.out.println("============================");
        System.out.println();

        account.setAnnualInterestRate(SavingsAccount.getAnnualInterestRate()*0.04);

        double interest1=account.calculateMonthlyInternet();
        System.out.println("Set Annual Interest 4% is : "+interest1);
        System.out.println("============================");
        System.out.println();

        account.setAnnualInterestRate(SavingsAccount.getAnnualInterestRate()*0.05);

        double interest2=account.calculateMonthlyInternet();
        System.out.println("Set Annual Interest 5% is : "+interest2);






    }
}
