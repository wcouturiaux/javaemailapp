package bankapp;

public class Savings extends Account {
    // List props specific to savings
    private int safetyDepositBoxID;
    private int getSafetyDepositBoxKey;
    // Constructor to initialize settings for savings props
    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        acctNumber = "1" + acctNumber;
        //System.out.println("  New Savings account");
        //System.out.println("ACCOUNT NUM: " + this.acctNumber);
        //System.out.println("NAME: " + name); move to ACCOUNT as shared between acct types
    }
    // List methods specific to savings acct.
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" ACCOUNT TYPE: Savings");
    }
}
