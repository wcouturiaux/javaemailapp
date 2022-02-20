package bankapp;

public class BankApp {
    public static void main(String[] args) {
        Checking chkacct1 = new Checking("Tom Wilson", "3333333334", 1500);
        Savings savacct1 = new Savings("Jim Bob", "3333333331", 2200);
        chkacct1.showInfo();
        savacct1.showInfo();

        savacct1.deposit(4500);
        savacct1.withdraw(500);
        savacct1.transfer("My Pocket", 1100);
        savacct1.compound();
        //Read CSV of customers

        //Create Customer Accounts from CSV data
    }
}
