package A24_Bank;

public class SavingAccount extends EarningAccount{

    enum Category{
        YOUNG(6),
        ADULT(7),
        SENIOR_CITIZEN(8);

        private int profitRatio;

        Category(int profitRatio){
            this.profitRatio=profitRatio;
        }
        int getProfitRatio(){
            return profitRatio;
        }
    }

    private Category category;

    SavingAccount(double balance,int id,String holderName,boolean zakatApplicable,boolean filer,int age){
        super(balance, id, holderName, zakatApplicable, filer);

        category=age<35?Category.YOUNG:age<=50?Category.ADULT:Category.SENIOR_CITIZEN;

    }

    @Override
    double getTotalEarning(){
        return getBalance()*(1+category.getProfitRatio()/100.0);
    }
}
