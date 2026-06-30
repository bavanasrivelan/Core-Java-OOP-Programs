package day3;

public class Exercise5 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();
        savings.displayBankName();
        savings.calculateInterest();
        current.displayBankName();
        current.calculateInterest();
    }
}
abstract class BankAccount {
    abstract void calculateInterest();
    void displayBankName() {
        System.out.println("Bank Name: Indian Bank");
    }
}
class SavingsAccount extends BankAccount {
    @Override
    void calculateInterest() {
        System.out.println("Savings Account Interest: 5%");
    }
}
class CurrentAccount extends BankAccount {
    @Override
    void calculateInterest() {
        System.out.println("Current Account Interest: 2%");
    }
}