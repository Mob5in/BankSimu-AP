package Bank;

public class TransactionAccount extends BankAccount{

    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("There is no interest");
    }


    @Override
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Amount is wrong");
        }else{
            this.balance -= amount;
            if(this.balance + overDraftLimit < 0){
                System.out.println("Cant withdraw that amount");
                this.balance += amount;
                return;
            }
            System.out.println("Account number: " + this.getAccountNumber() +"\n"+ amount +"  decreases");
        }
    }


}
