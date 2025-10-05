package Bridge.PaymentMethod;

import Bridge.Gateaways.IPaymentG;

public class OnlinePayment extends Payment {
    public OnlinePayment(IPaymentG gateway) {
        super(gateway);
    }

    public void pay(double amount) {
        System.out.println("Online payment:");
        gateway.processPayment(amount);
    }
}
