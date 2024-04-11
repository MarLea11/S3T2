package N1EX2.Models;

import N1EX2.Models.Interfaces.PaymentMethod;

public class Transference implements PaymentMethod {

    @Override
    public void pay(double quantity) {
        System.out.println("You have payed " + quantity + " by transference.");
    }
}
