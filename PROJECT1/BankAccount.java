import java.util.Scanner;

import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(int hi){

    }

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initialBalance) { 
            balance = initialBalance;
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
        System.out.println("4: Transfer");
        System.out.println("5: Savings Account");
        System.out.println("0: Quit");
        System.out.println("------------------------\n");

        selection = input.nextInt();

        return selection;
    }

    public static void overdraft(BankAccount account, double withdrawlAmount){
        char isOk;
        Scanner keyboard = new Scanner(System.in);
        if(account.balance < withdrawlAmount){
            System.out.println("The amount you are trying to withdraw is over the amount in your balance you will be charged $35 is this ok y/n");
            isOk = keyboard.next().charAt(0);
            if(isOk == 'y'){
                account.withdraw(35 + withdrawlAmount);
                System.out.println("Current Balance after withdrawl: $" + account.balance);
            }
            else{
                System.out.println("Current Balance: $" + account.balance);
            }
            
        }
        else if (account.balance >= withdrawlAmount){
            account.withdraw(withdrawlAmount);
            System.out.println("Current Balance after withdrawl: $" + account.balance);
        }   
    }

    public static void transfer(BankAccount account1, BankAccount account2, double amount){
        account1.withdraw(amount);
        account2.deposit(amount);
        System.out.println("New balance of Account 1: $"+ account1.balance);
        System.out.println("New balance of Account 2: $"+ account2.balance);
    }

    public static void simpleInterest(int numyears, double rate, BankAccount account){
        double interestAmount;
        interestAmount = (account.balance * numyears * rate) / 100;
        System.out.println("Amount after " + numyears + " years: $" + interestAmount);
    }

    public static void savingsAccount(double initialBalance){
        Scanner keyboard = new Scanner(System.in);
        char isOk;
        int interestType;
        if(initialBalance >= 1000){
            System.out.println("Would you like to make this a savings account y/n");
            isOk = keyboard.next().charAt(0);
            if(isOk == 'y'){
                System.out.println("Would you like to use APY (which is a .0001 rate) or Principle and Interest (which is a .001 rate)type 1 for APY or 2 for Principle and Interest");
                interestType = keyboard.nextInt();
            }
        }   
    }
}

    

