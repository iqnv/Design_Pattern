package ATM_LLD;

import ATM_LLD.State.Idle_State;

public class ATM_MACHINE_APPLICATION {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("Shivam");
        bankAccount.setAccountNo(12334);
        bankAccount.setBalance(3000);
        Card card = new Card();
        card.setCardNo(122211);
        card.setCvv(354);
        card.setBankAccount(bankAccount);
        User user = new User();
        user.setBankAccount(bankAccount);
        user.setCard(card);

        ATMRoom atmRoom = new ATMRoom();
        atmRoom.setCard(card);
        atmRoom.setUser(user);
        ATM atm = new ATM();
        atm.setTotalMoney(4000);

        atm.setAtmState(new Idle_State());
        atm.getAtmState().insertCard(atm, card);
        atm.getAtmState().authentication(atm, card);
        atm.getAtmState().cashWithdrawl(atm, 3000);
        atm.getAtmState().cashWithdrawl(atm, 3000);





    }
}
