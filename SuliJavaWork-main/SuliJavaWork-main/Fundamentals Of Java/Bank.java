import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	private ArrayList<Account> accounts;
	private static int latestAccount;

    Bank() { /*A new bank is defined with a list of bank accounts and a value that keeps track of the account number of the 
			 most recently added account*/
        this.accounts = new ArrayList<Account>();
        Bank.latestAccount = -1; 
    }
    
    public int login() {
    /*This method should ask the user to give their account number and password, returning the account number if they match, 
	or returning -1 if not*/
        try {
            System.out.println("Enter account number: ");
            int accountNumber = Integer.parseInt(Console.readLine());
            System.out.println("Enter password: ");
            String password = Console.readLine();
            Account checkPass = accounts.get(accountNumber);
            if(checkPass.checkPassword(password)){
                return accountNumber;
            }
            else{
                System.out.println("invalid account number");
                return-1;
            }
        }
        catch (Exception e) {
            return -1;
        }
    }
    
    public void deposit(int number) {
    /*This method should ask the user how much money they want to deposit into their account, and correctly update the 
	balance of their account*/
        Account account = accounts.get(number);
        System.out.println("how much money do you want to withdraw?");
        int amount =Integer.parseInt(Console.readLine());
        account.setBalance(account.getBalance() + amount);
    }
    
    public void withdraw(int number) {
    /*This method should ask the user how much money they want to withdraw from their account, and correctly update 
	the balance of their account*/
        Account account = accounts.get(number);
        System.out.println("how much money do you want to withdraw?");
        int amount =Integer.parseInt(Console.readLine());
        account.setBalance(account.getBalance() - amount);
    }
    
    public void checkBalance(int number) {
    //This method should display a message telling the user how much money is in their account
        Account account = accounts.get(number);
        System.out.println("you have £"+ account.getBalance());
    }
    
    public void addAccount() {
    /*This method should create a new account with an account number 1 larger than the account number or the last account 
	created, a password given by the user, and a balance of 0. The account should be added to the bank's list of accounts*/
        System.out.println("Enter account password: ");
        String password = Console.readLine();
        Account account = new Account(Bank.latestAccount + 1, password, 0 );
        accounts.add(account);
        latestAccount++;
    }
}