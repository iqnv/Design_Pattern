package ATM_LLD.Processor;

public class Cash2K extends CashwithdrwalProcessor{

    public Cash2K(CashwithdrwalProcessor nextCashwithdrawprocessor) {
        super(nextCashwithdrawprocessor);
    }

    @Override
    public boolean money(int amount) {
        if (amount == 2000) {
            return true;
        }
        while (amount >= 2000) {
            amount = amount - 2000;
        }
        if (amount == 0) {
            return true;
        }
        else {
            super.withDrawMoney(amount);
        }
        return true;
    }


}
