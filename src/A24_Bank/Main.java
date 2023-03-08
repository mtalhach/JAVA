package A24_Bank;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------WELCOME____________________________");
        System.out.println("=== === === === === === === === === === === === === === === === === ");
        System.out.println("---------------------Current Account--------------------");
        CurrentAccount account1=new CurrentAccount(1000,101,"Talha",true);
        account1.deductZakat();
        System.out.println("Holder Name: "+account1.getHolderName() +"        Balance After Deduce Zakar: "+account1.getBalance());
        CurrentAccount account2=new CurrentAccount(1000,102,"Zeeshan",false);
        System.out.println("Holder Name: "+account2.getHolderName() +"        No Deduction Because This Account Can't Hold Zakat: "+account2.getBalance());
        System.out.println("=== === === === === === === === === === === === === === === === === ");


        System.out.println("---------------------Saving Account--------------------");
        SavingAccount account3=new SavingAccount(10000,103,"Hanzla",false,false,20);
        System.out.println("Holder Name: "+account3.getHolderName() +"        Total Earning: "+account3.getTotalEarning());
        SavingAccount account4=new SavingAccount(10000,104,"Ali",false,true,30);
        account4.withDraw(1000);
        System.out.println("Holder Name:  "+account4.getHolderName()+"          Balance After WithDraw:  "+account4.getBalance());
        System.out.println("=== === === === === === === === === === === === === === === === === ");


        System.out.println("---------------------Investment Account--------------------");
        InvestmentAccount account5=new InvestmentAccount(10000,105,"Tayyab",false,false,InvestmentAccount.Type.ONE_YEAR);
        System.out.println("Holder Name: "+account5.getHolderName()+"       Total Earning: "+account5.getTotalEarning());
        InvestmentAccount account6=new InvestmentAccount(10000,106,"Farooq",false,false,InvestmentAccount.Type.THREE_YEAR);
        System.out.println("Holder Name: "+account6.getHolderName()+"       Total Earning: "+account6.getTotalEarning());
        InvestmentAccount account7=new InvestmentAccount(10000,107,"Haseeb",false,false,InvestmentAccount.Type.FIVE_YEAR);
        System.out.println("Holder Name: "+account7.getHolderName()+"       Total Earning: "+account7.getTotalEarning());
        System.out.println("=== === === === === === === === === === === === === === === === === ");


        System.out.println("---------------------Total Earning--------------------");
        System.out.println("Total Earning: "+EarningAccount.getTotalProfitPaid(account3,account4,account5,account6,account7));










    }
}
