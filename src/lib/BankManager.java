
package lib;

import java.util.*;

public class BankManager {
    private List<BankAccount> accountList;
    private Set<BankAccount> accountSet;
    private Map<String, BankAccount> accountMap;

    public BankManager() {
        accountList = new ArrayList<>();
        accountSet = new HashSet<>();
        accountMap = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        accountList.add(account);
        accountSet.add(account);
        accountMap.put(account.getAccountNumber(), account);
    }

    public void printAccountsList() {
        System.out.println("Bank Account List (ArrayList):");
        for (BankAccount acc : accountList) {
            System.out.println(acc);
        }
    }

    public void printAccountsSet() {
        System.out.println("Bank Account Set (HashSet):");
        for (BankAccount acc : accountSet) {
            System.out.println(acc);
        }
    }

    public void printAccountsMap() {
        System.out.println("Bank Account Map (HashMap):");
        accountMap.forEach((accountNumber, account) -> System.out.println("Key: " + accountNumber + ", Value: " + account));
    }

    public void sortAccountsByBalance() {
        accountList.sort(Comparator.comparingDouble(BankAccount::getBalance));
        System.out.println("Accounts sorted by balance:");
        accountList.forEach(System.out::println);
    }

    public void printUniqueAccountHoldersSorted() {
        Set<String> uniqueHolders = new TreeSet<>();
        for (BankAccount acc : accountList) {
            uniqueHolders.add(acc.getAccountHolderName());
        }
        System.out.println("Unique Account Holders (TreeSet):");
        uniqueHolders.forEach(System.out::println);
    }
}
