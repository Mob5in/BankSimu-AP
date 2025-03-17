package Bank;

public class SavingAccount extends BankAccount{

    private final double interestRate = 0.03;


    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }



    @Override
    public void calculateInterest() {
        System.out.println("Saving Account");
        deposit(this.balance * interestRate);
    }
}
