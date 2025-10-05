package Bridge.PaymentMethod;

import Bridge.Gateaways.IPaymentG;

public class SubscriptionPayment extends Payment{
    public SubscriptionPayment(IPaymentG gateway) {
        super(gateway);
    }

    public void pay(double amount) {
        System.out.println("Subscription payment:");
        gateway.processPayment(amount);
    }
}
