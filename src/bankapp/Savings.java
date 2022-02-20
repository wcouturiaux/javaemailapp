package bankapp;

public class Savings extends Account {
    // List props specific to savings
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize settings for savings props
    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        acctNumber = "1" + acctNumber;
        setSafteyDepositBox();
        //System.out.println("  New Savings account");
        //System.out.println("ACCOUNT NUM: " + this.acctNumber);
        //System.out.println("NAME: " + name); move to ACCOUNT as shared between acct types
    }
    // List methods specific to savings acct.
    private void setSafteyDepositBox() {
        safetyDepositBoxID = (int) (100 + Math.random() * (Math.pow(10,3)-100));
        safetyDepositBoxKey = (int) (1000 + Math.random() * (Math.pow(10,4)-1000));
        System.out.println(safetyDepositBoxID + "/" + safetyDepositBoxKey);
    }

    @Override
    public void showInfo() {
        System.out.println(" ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
                " SAFETY DEPOSIT BOX ID: " + safetyDepositBoxID +
                 "\n SAFETY DEPOSIT BOX KEY: " + safetyDepositBoxKey
        );
    }
}
