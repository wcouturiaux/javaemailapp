package bankapp;

import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        String file = "/Users/WillC/javabyprojects/emailApp/NewBankAccounts.csv";

        //Read CSV of customers
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String ssn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            //System.out.println(name + " " + ssn + " " + accountType + " $" + initDeposit);
            if (accountType.equals("Savings")) {
                System.out.println("OPEN A SAVINGS ACCOUNT");
            }
            else if (accountType.equals("Checking")) {
                System.out.println("OPEN A CHECKING ACCOUNT");
            }
            else {
                System.out.println("Error reading account type");
            }
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
