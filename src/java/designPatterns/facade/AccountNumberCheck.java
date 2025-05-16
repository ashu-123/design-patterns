package facade;

public class AccountNumberCheck {

    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isAccountActive(int accNumberToCheck) {
        return this.accountNumber==accNumberToCheck;
    }
}
