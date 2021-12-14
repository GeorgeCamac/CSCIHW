import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initalBalance) {
        balance = initalBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public double getBalance(){
        return balance;
    }
    public void monthlyFee(){
        withdraw(10);
    }
    // P (1 + R/n)^(nt) - P
    // P = principal
    // t = years
    // r = annual interest rate
    // n = # of times its compounded
    // PEMDAS
    public void calcInterest(double p, int t, double r, int n){
        double amount = p * Math.pow(1 + (r / n), n*t);
        double compinterest = amount - p;
        System.out.println("Compound Interest after "+ t + " years: "+ compinterest);
        System.out.println("Amount after "+ t + " years: "+ amount);
    }

    public void investment(double balance, double r, double targetBalance){
        int year = 0; 
        while(balance<= targetBalance){
            year++;
            double interest = balance * r / 100;
            balance = balance + interest;
        }
        System.out.println("Total Balance: $"+ balance);
        System.out.println("Investment doubled After "+ year + " years.");
    }



    public static int menu() {
        
        int selection;
        Scanner input = new Scanner(System.in);

        /*******************************************/
        System.out.println("Please select an option:");
        System.out.println("------------------------\n");
        System.out.println("1: Get Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("0: Quit");
        System.out.println("------------------------\n");

        selection = input.nextInt();

        return selection;
    }
    
    public void overdraft(BankAccount account, double withdrawAmount){
        Scanner keyboard = new Scanner(System.in);
        char permission;
        double amountOverdraft;
        if(account.getBalance() - withdrawAmount < 0){
            System.out.println("If you withdraw this amount you will be charged a $35 overdraft fee is this ok y/n");
            permission = keyboard.nextLine().charAt(0);
            if(permission == 'y'){
                account.withdraw(35);
                BankAccount.menu();
            }
            else if(permission == 'n'){
                amountOverdraft = -1 * (account.balance - withdrawAmount);
                System.out.println("You are trying to withdraw $" + amountOverdraft + " to much you may withdraw $" + amountOverdraft + " less to avoid the fee");
                BankAccount.menu();
            }
            else{
                System.out.println("Wrong input try again");
                BankAccount.menu();
            }
            
        }
        
        
    }
}


