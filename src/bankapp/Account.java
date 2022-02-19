package bankapp;

public abstract class Account implements IBaseRate{
    // List common properties for checking and savings

    // Constructor to set base properties and initialize acct.
    public Account(String name) {
        System.out.println("New Account: ");
        System.out.println("  NAME: " + name);
    }
    // List common methods
}
