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
        System.out.println("NAME: " + name + " SSN: " + ssn + " BALANCE: $" + balance);
        index++;
        this.acctNumber = setAccountNumber();
        System.out.println("ACCOUNT NUM: " + this.acctNumber);
        //System.out.println("New Account: ");
        //System.out.println("  NAME: " + name);
    }
    // List common methods
    private String setAccountNumber() {
        String lastTwoOfSSN = ssn.substring(ssn.length()-2,ssn.length());
        int uniqueID = index;
        int randomNum = (int)(Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNum;
    }
}
