package ATM_LLD.Processor;

public class Cash100 extends CashwithdrwalProcessor{
    public Cash100(CashwithdrwalProcessor nextCashwithdrwalProcessor) {
        super(nextCashwithdrwalProcessor);
    }

    @Override
    public boolean money(int amount) {
        if (amount == 100) {
            return true;
        }
        while (amount >= 100) {
            amount = amount - 100;
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
