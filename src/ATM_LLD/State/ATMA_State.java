package ATM_LLD.State;

import ATM_LLD.ATM;
import ATM_LLD.Card;

public abstract class ATMA_State {


    public abstract void insertCard(ATM atmaState, Card card);
    public abstract void authentication(ATM atmaState, Card card);
    public abstract void cashWithdrawl(ATM atmaState, int amount);
    public abstract void checkBalance(ATM atmaState);
    public abstract void cnacel(ATM atmaState);
}
