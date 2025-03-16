package Bank;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest() {

    }
}
