package emailapp;

public class emailApp {

    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");
        em1.setMailboxCapacity(1000);
        System.out.println(em1.getMailboxCapacity());
    }
}
