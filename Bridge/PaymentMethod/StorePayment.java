package Bridge.PaymentMethod;

import Bridge.Gateaways.IPaymentG;

public class StorePayment extends Payment {
    public StorePayment(IPaymentG gateway) {
        super(gateway);
    }

    public void pay(double amount) {
        System.out.println("Store payment:");
        gateway.processPayment(amount);
    }
}
