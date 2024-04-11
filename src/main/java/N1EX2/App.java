package N1EX2;

import N1EX2.Models.*;
import N1EX2.Models.Interfaces.PaymentMethod;

public class App {

    private App(){};

    public static void runProgram(){

        PaymentGateway paymentGateway = new PaymentGateway();
        PaymentMethod paymentMethod;
        int userOption;
        double userQuantity;

        do {
            userQuantity = Input.readDouble("Put the quantity you want to pay.");
            System.out.println("1. Credit Card");
            System.out.println("2. Paypal");
            System.out.println("3. Transference");
            System.out.println("0. Exit");
            userOption = Input.readInt("Select an option");

            switch (userOption) {
                case 1:
                    paymentMethod = new CreditCard();
                    paymentGateway.paymentProcess(paymentMethod, userQuantity);
                    break;
                case 2:
                    paymentMethod = new Paypal();
                    paymentGateway.paymentProcess(paymentMethod, userQuantity);
                    break;
                case 3:
                    paymentMethod = new Transference();
                    paymentGateway.paymentProcess(paymentMethod, userQuantity);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while(true);
    }
}
