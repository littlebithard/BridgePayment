package Bridge.PaymentMethod;

import Bridge.Gateaways.IPaymentG;

public abstract class Payment {
    protected IPaymentG gateway;

    public Payment(IPaymentG gateway) {
        this.gateway = gateway;
    }

    public abstract void pay(double amount);
}
