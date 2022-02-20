package bankapp;

public interface IBaseRate {
    // Method to set base rate.
    default double getBaseRate() {
        return 2.5;
    }
}
