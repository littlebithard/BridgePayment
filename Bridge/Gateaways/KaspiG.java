package Bridge.Gateaways;

public class KaspiG implements IPaymentG {
    public void processPayment(double amount) {
        System.out.println("Processing payment via Kaspi Bank: " + amount);
    }
}
