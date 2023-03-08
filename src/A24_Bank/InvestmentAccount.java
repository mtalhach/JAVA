package A24_Bank;

public class InvestmentAccount extends EarningAccount{
    enum Type{
        ONE_YEAR(10),
        THREE_YEAR(12),
        FIVE_YEAR(14);

        private int profitRatio;

        Type(int profitRatio){
            this.profitRatio=profitRatio;
        }

        double getProfitRatio(){
            return  profitRatio;
        }
    }
    private Type type;

    InvestmentAccount(double balance,int id,String holderName,boolean zakatApplicable,boolean filer,Type type){
        super(balance, id, holderName, zakatApplicable, filer);
        this.type=type;
    }

    @Override
    void withDraw(double amount){
        super.withDraw(amount*1.04);
    }

    @Override
    double getTotalEarning(){
        return switch (type){
            case ONE_YEAR -> getBalance()*(1+type.getProfitRatio()/100.0);
            case THREE_YEAR -> getBalance()*Math.pow(1+type.getProfitRatio()/100.0,3);
            case FIVE_YEAR -> getBalance()*Math.pow(1+type.getProfitRatio()/100.0,5);
        };
    }
}
