package ATM_LLD.State;

import ATM_LLD.ATM;
import ATM_LLD.Card;

public class Idle_State extends ATMA_State{
    @Override
    public void insertCard(ATM atmaState, Card card) {
        System.out.println("Please insert your card");
        atmaState.setAtmState(new Has_Card_State(card));

    }

    @Override
    public void authentication(ATM atmaState, Card card) {

    }


    @Override
    public void cashWithdrawl(ATM atmaState, int amount) {

    }

    @Override
    public void checkBalance(ATM atmaState) {

    }

    @Override
    public void cnacel(ATM atmaState) {

    }
}
