package day3;

public class Exercise6 {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        CardPayment card = new CardPayment();
        upi.makePayment(1000);
        card.makePayment(2500);
    }
}
interface Payment {
    void makePayment(double amount);
}
class UPIPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("UPI Payment of Rs. " + amount + " successful.");
    }
}
class CardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Card Payment of Rs. " + amount + " successful.");
    }
}