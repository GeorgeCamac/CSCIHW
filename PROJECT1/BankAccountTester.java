package PROJECT1;

public class BankAccountTester {

    public static void main(String[] args) {
        BankAccount gregChecking = new BankAccount();
        BankAccount bobChecking = new BankAccount(10000);

        System.out.println(gregChecking.getBalance());
        System.out.println("Balance Starting");
        System.out.println(bobChecking.getBalance());
        bobChecking.withdraw(500);
        System.out.println("Balance After withdraw");
        System.out.println(bobChecking.getBalance());
        bobChecking.deposit(100);
        System.out.println("Balance After Deposit");
        System.out.println(bobChecking.getBalance());

        // gregChecking.monthlyFee();

        System.out.println(gregChecking.getBalance());
        
        gregChecking.deposit(50000);
        gregChecking.calcInterest(gregChecking.getBalance(), 10, 0.40, 12);


    }
    
}