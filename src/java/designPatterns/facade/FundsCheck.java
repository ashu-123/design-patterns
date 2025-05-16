package facade;

public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) { this.cashInAccount-=cashWithdrawn; }

    public void increaseCashInAccount(double cashDeposited) { this.cashInAccount+=cashDeposited; }

    public boolean isAccountFundsEnough(double cashToWithdraw) {
        if(this.cashInAccount<=cashToWithdraw) {
            System.out.println("Error: you don't have enough money");
            System.out.println("Current Balance: " + this.cashInAccount);
            return false;
        }
        else {
            this.decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdrawal successful!");
            System.out.println("Current balance: " + this.cashInAccount);
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit) {
        this.increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Successful");
        System.out.println("Current Balance: " + this.cashInAccount);
    }
}
