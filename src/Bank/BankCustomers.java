package Bank;
import java.util.ArrayList;
import java.util.Objects;

public class BankCustomers {

    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account){
        accountsList.add(account);
    }

    public void showAllBalances(){
        System.out.println("Account Number              balance");
        for(BankAccount account: accountsList){
            System.out.println(account.getAccountNumber()+"                      "+account.getBalance());
        }

    }

    public BankAccount findAccount(String accountNumber){
        for(BankAccount account: accountsList){
            if(Objects.equals(accountNumber, account.getAccountNumber())){
                System.out.println("Account Find and returned");
                return account;
            }
        }
        System.out.println("Wrong account number");
        return null;
    }
}
