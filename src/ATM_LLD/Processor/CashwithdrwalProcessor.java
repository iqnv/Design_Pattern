package ATM_LLD.Processor;

public abstract class CashwithdrwalProcessor {

    private CashwithdrwalProcessor nextCashwithdrwalProcessor;

    public CashwithdrwalProcessor(CashwithdrwalProcessor nextCashwithdrwalProcessor) {
        this.nextCashwithdrwalProcessor = nextCashwithdrwalProcessor;
    }

    public void withDrawMoney(int money) {
        if (money == 0) {
            System.out.println("Please Collect your money");
        }
        else if (nextCashwithdrwalProcessor != null) {
            if (money != 0) {
               nextCashwithdrwalProcessor.money(money);
            }
        }
        else {
           System.out.println("PLease try again letter");
        }
    }

    public abstract boolean money(int amount);

}
