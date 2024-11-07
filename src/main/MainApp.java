package main;

import lib.BankAccount;
import lib.BankManager;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        BankManager manager = new BankManager();
        try (Scanner scanner = new Scanner(System.in)) {

        // Adding sample bank accounts
        manager.addAccount(new BankAccount("12345", "John Doe", 1500.50));
        manager.addAccount(new BankAccount("67890", "Jane Smith", 2500.75));
        manager.addAccount(new BankAccount("54321", "Alice Brown", 3000.00));
        manager.addAccount(new BankAccount("09876", "Bob White", 1000.25));
        manager.addAccount(new BankAccount("12345", "John Doe", 1500.50)); // Duplicate

        // Print collections
        manager.printAccountsList();
        manager.printAccountsSet();
        manager.printAccountsMap();

        // Sort and print by balance
        manager.sortAccountsByBalance();

        // Print unique account holders in sorted order
        manager.printUniqueAccountHoldersSorted();

        // User input to add more accounts
        System.out.println("\nAdd a new bank account:");
        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String accHolder = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        manager.addAccount(new BankAccount(accNumber, accHolder, balance));
        
        // Print updated collections
    }
        System.out.println("\nUpdated Account List:");
        manager.printAccountsList();
    }
}