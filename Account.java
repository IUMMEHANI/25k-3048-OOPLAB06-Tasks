package INHERITANCE;

public class Account {
    public double balance = 20000;
}
class SavingsAccount extends Account {
}
class PremiumSavings extends SavingsAccount {
    void calculateInterest() {
        double interest = balance * 0.07;
        int Interest = (int) interest;
        System.out.println("Interest: " + Interest);
    }
    public static void main(String[] args) {
        PremiumSavings p1 = new PremiumSavings();
        p1.calculateInterest();
    }
}

