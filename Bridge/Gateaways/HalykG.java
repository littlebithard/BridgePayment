package Bridge.Gateaways;

public class HalykG implements IPaymentG {
    public void processPayment(double amount) {
        System.out.println("Processing payment via Halyk Bank: " + amount);
    }
}
