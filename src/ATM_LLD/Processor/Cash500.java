package ATM_LLD.Processor;

public class Cash500 extends CashwithdrwalProcessor{
    public Cash500(CashwithdrwalProcessor nextCashwithdrwalProcessor) {
        super(nextCashwithdrwalProcessor);
    }

    @Override
    public boolean money(int amount) {
        if (amount == 500) {
            return true;
        }
        while (amount >= 500) {
            amount = amount - 500;
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
