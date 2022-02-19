package bankapp;

public class Savings extends Account {
    // List props specific to savings

    // Constructor to initialize settings for savings props
    public Savings(String name) {
        super(name);
        System.out.println("  New Savings account");
        //System.out.println("NAME: " + name); move to ACCOUNT as shared between acct types
    }
    // List methods specific to savings acct.
}
