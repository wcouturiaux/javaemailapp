package bankapp;

import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        String file = "/Users/WillC/javabyprojects/emailApp/NewBankAccounts.csv";

        //Read CSV of customers
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }
        //Create Customer Accounts from CSV data

        /* Used as unit tests during development
        Checking chkacct1 = new Checking("Tom Wilson", "3333333334", 1500);
        Savings savacct1 = new Savings("Jim Bob", "3333333331", 2200);
        chkacct1.showInfo();
        savacct1.showInfo();

        savacct1.deposit(4500);
        savacct1.withdraw(500);
        savacct1.transfer("My Pocket", 1100);
        savacct1.compound();
         */
    }
}
