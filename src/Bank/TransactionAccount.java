package Bank;

public class TransactionAccount extends BankAccount{
    public TransactionAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest() {

    }


}
