package bankapp;

public class Checking extends Account {
    //List checking specific properties

    //Constructor to initialize checking acct props
    public Checking(String name) {
        super(name);
        System.out.println("  New Checking account");
        //System.out.println("NAME: " + name); Common output for all accts move to Account class
    }
    // List any methods specific to checking
}
