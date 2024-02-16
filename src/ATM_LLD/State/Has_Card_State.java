package ATM_LLD.State;

import ATM_LLD.ATM;
import ATM_LLD.Card;

public class Has_Card_State extends ATMA_State{

    private Card card;
    public Has_Card_State(Card card) {
        this.card = card;
    }
    @Override
    public void insertCard(ATM atmaState, Card card) {

    }

    @Override
    public void authentication(ATM atmaState, Card card) {
            // authenticate Card;
        atmaState.setAtmState(new Selection_State());
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
