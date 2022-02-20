package bankapp;

public abstract class Account implements IBaseRate{
    // List common properties for checking and savings
    String name;
    String ssn;
    double balance;

    static int index = 10000;
    String acctNumber;
    double rate;
    // Constructor to set base properties and initialize acct.
    public Account(String name, String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;
        //System.out.println("NAME: " + name + " SSN: " + ssn + " BALANCE: $" + balance);
        index++;
        this.acctNumber = setAccountNumber();
        setRate();
        //System.out.println("ACCOUNT NUM: " + this.acctNumber);
        //System.out.println("New Account: ");
        //System.out.println("  NAME: " + name);
    }

    public abstract void setRate();

    // List common methods
    private String setAccountNumber() {
        String lastTwoOfSSN = ssn.substring(ssn.length()-2,ssn.length());
        int uniqueID = index;
        int randomNum = (int)(Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNum;
    }

    //Common transactions
    public void deposit(double amount) {
        balance += amount;
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                 "\n ACCOUNT NUMBER: " + acctNumber +
                 "\n BALANCE: " + balance +
                 "\n RATE: " + rate
        );
    }
}
