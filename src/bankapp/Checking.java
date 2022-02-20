package bankapp;

import java.util.concurrent.ThreadLocalRandom;

public class Checking extends Account {
    //List checking specific properties
    private Long debitCardNumber;
    private int debitCardPin;

    //Constructor to initialize checking acct props
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        acctNumber = "2" + acctNumber;
        setDebitCard();
        //System.out.println("  New Checking account");
        //System.out.println("ACCOUNT NUM: " + this.acctNumber);
        //System.out.println("NAME: " + name); Common output for all accts move to Account class
    }
    @Override
    public void setRate() {
        rate = getBaseRate()*.15;
    }

    // List any methods specific to checking
    private void setDebitCard() {
        debitCardNumber = ThreadLocalRandom.current().nextLong(100000000000L,999999999999L);
        debitCardPin = (int) (1000 + Math.random() * (Math.pow(10,4)-1000));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" ACCOUNT TYPE: Checking");
        System.out.println(
                " DEBIT CARD NUMBER: " + debitCardNumber +
                "\n DEBIT CARD PIN: " + debitCardPin
        );
    }
}
