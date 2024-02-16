package ATM_LLD.State;

import ATM_LLD.ATM;
import ATM_LLD.Card;

public class Selection_State extends ATMA_State{
    @Override
    public void insertCard(ATM atmaState, Card card) {

    }

    @Override
    public void authentication(ATM atmaState, Card card) {

    }

    @Override
    public void cashWithdrawl(ATM atmaState, int amount) {
        System.out.println("You are withdrawing " + amount);
        atmaState.setAtmState(new Cashwithdrawl_State(amount));
    }

    @Override
    public void checkBalance(ATM atmaState) {

    }

    @Override
    public void cnacel(ATM atmaState) {

    }
}
