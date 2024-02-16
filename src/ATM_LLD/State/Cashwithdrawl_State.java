package ATM_LLD.State;

import ATM_LLD.ATM;
import ATM_LLD.Card;
import ATM_LLD.Processor.Cash100;
import ATM_LLD.Processor.Cash2K;
import ATM_LLD.Processor.Cash500;
import ATM_LLD.Processor.CashwithdrwalProcessor;

public class Cashwithdrawl_State extends ATMA_State{

    public Cashwithdrawl_State(int amount) {

    }
    @Override
    public void insertCard(ATM atmaState, Card card) {

    }

    @Override
    public void authentication(ATM atmaState, Card card) {

    }

    @Override
    public void cashWithdrawl(ATM atmaState, int amount) {
        CashwithdrwalProcessor cashwithdrwalProcessor = new Cash2K(new Cash500(new Cash100(null)));
        cashwithdrwalProcessor.money(amount);
        if (amount != 0) {
            atmaState.setAtmState(new Idle_State());
        }
    }

    @Override
    public void checkBalance(ATM atmaState) {

    }

    @Override
    public void cnacel(ATM atmaState) {

    }
}
