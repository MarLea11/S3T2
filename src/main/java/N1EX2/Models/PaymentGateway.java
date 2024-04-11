package N1EX2.Models;

import N1EX2.Models.Interfaces.PaymentMethod;

public class PaymentGateway {

    public void paymentProcess(PaymentMethod paymentMethod, double quantity) {
        paymentMethod.pay(quantity);
    }

}
