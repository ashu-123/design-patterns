package facade;

public class TestBankAccount {

    public static void main(String[] args) {
        BankAccountFacade bankAccountFacade = new BankAccountFacade(12345678, 1234);

        bankAccountFacade.withdrawCash(50.00);
        bankAccountFacade.withdrawCash(900.00);
        bankAccountFacade.depositCash(200.00);
    }
}
