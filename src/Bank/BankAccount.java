package Bank;


public abstract class BankAccount {


    private final String accountNumber;
    private String accountHolderName;
    protected double balance;


    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    public abstract void calculateInterest();


    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Amount is wrong ");
            return;
        }else{
            this.balance += amount;
            System.out.println("Account number: " + this.accountNumber +"\n"+ amount +"  increases");
        }
    }


    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Amount is wrong");
        }else{
            this.balance -= amount;
            System.out.println("Account number: " + this.accountNumber +"\n"+ amount +"  decreases");
        }
    }


    public double getBalance(){
        return this.balance;
    }


    public String getAccountNumber(){
        return this.accountNumber;
    }


    public String getAccountHolderName(){
        return this.accountHolderName;
    }
}






