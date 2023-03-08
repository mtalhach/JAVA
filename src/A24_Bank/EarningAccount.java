package A24_Bank;

public abstract class EarningAccount extends Account{
    private boolean filer;
    EarningAccount(double balance, int id, String holderName, boolean zakatApplicable,boolean filer){
        super(balance, id, holderName, zakatApplicable);
        this.filer=filer;
    }

    @Override
    void withDraw(double amount){
        if(filer){
            super.withDraw(amount*1.02);
        }
        else {
            super.withDraw(amount*1.04);
        }
    }

    abstract double getTotalEarning();

    static double getTotalProfitPaid(EarningAccount...accounts){
        double profit=0;
        for(EarningAccount account:accounts){
            profit+=account.getTotalEarning()-account.getBalance();
        }
        return profit;
    }
}
