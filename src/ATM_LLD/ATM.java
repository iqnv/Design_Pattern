package ATM_LLD;

import ATM_LLD.State.ATMA_State;

public class ATM {

    private ATMA_State atmState;
    private Card card;

    private int totalMoney;

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public ATMA_State getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMA_State atmState) {
        this.atmState = atmState;
    }
}
