package Bridge;

import Bridge.Gateaways.*;
import Bridge.PaymentMethod.*;

public class Main {
    public static void main(String[] args) {
        Payment onlineKaspi = new OnlinePayment(new KaspiG());
        onlineKaspi.pay(15000.0);

        Payment inStoreHalyk = new StorePayment(new HalykG());
        inStoreHalyk.pay(8000.0);

        Payment subscriptionKaspi = new SubscriptionPayment(new KaspiG());
        subscriptionKaspi.pay(2990.0);
    }
}
