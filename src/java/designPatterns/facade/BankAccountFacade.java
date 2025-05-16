package facade;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;
    private AccountNumberCheck accountNumberCheck;
    private SecurityCodeCheck securityCodeCheck;
    private FundsCheck fundsCheck;
    private WelcomeBank welcomeBank;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        this.welcomeBank = new WelcomeBank();
        this.accountNumberCheck = new AccountNumberCheck();
        this.fundsCheck = new FundsCheck();
        this.securityCodeCheck = new SecurityCodeCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToWithdraw) {
        if(accountNumberCheck.isAccountActive(this.accountNumber) &&
           securityCodeCheck.isSecurityCheckCodeCorrect(this.securityCode) &&
           fundsCheck.isAccountFundsEnough(cashToWithdraw)) {
            System.out.println("Transaction Completed");
        }
        else {
            System.out.println("Transaction failed");
        }
    }

    public void depositCash(double cashToDeposit) {
        if(accountNumberCheck.isAccountActive(accountNumber) &&
           securityCodeCheck.isSecurityCheckCodeCorrect(securityCode)) {
            fundsCheck.makeDeposit(cashToDeposit);
            System.out.println("Transaction completed");
        }
        else System.out.println("Transaction failed");
    }
}
