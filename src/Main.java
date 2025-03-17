import Bank.*;

public class Main {
    public static void main(String[] args) {

        BankCustomers EgtesadNovin = new BankCustomers();

        TransactionAccount Mobin = new TransactionAccount("123", "Mobin", 1250);
        TransactionAccount Negar = new TransactionAccount("124", "Negar", 50000);
        SavingAccount Amin = new SavingAccount("452", "Amin", 764);


        EgtesadNovin.addAccount(Mobin);
        EgtesadNovin.addAccount(Negar);
        EgtesadNovin.addAccount(Amin);


        EgtesadNovin.findAccount("124");
        System.out.println("------------------------------------------");
        EgtesadNovin.findAccount("120");
        System.out.println("------------------------------------------");


        System.out.println(Mobin.getBalance());
        Mobin.deposit(450);
        System.out.println(Mobin.getBalance());
        System.out.println("------------------------------------------");
        Amin.deposit(-450);
        System.out.println("------------------------------------------");


        Mobin.calculateInterest();
        System.out.println(Mobin.getBalance());
        System.out.println("------------------------------------------");
        Amin.calculateInterest();
        System.out.println(Amin.getBalance());
        System.out.println("------------------------------------------");


        Negar.withdraw(250000);
        Negar.withdraw(-500);
        Negar.withdraw(350);
        System.out.println("------------------------------------------");
        Amin.withdraw(5000000);
        Amin.withdraw(-1);
        Amin.withdraw(200);


        EgtesadNovin.showAllBalances();

    }
}