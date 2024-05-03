package org.howard.edu.lsp.oopfinal.question2;

public class CreditCardPayment implements PaymentStrategy {
    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amt) {
        System.out.println("Paid " + amt + " using credit card " + creditCardNumber);
    }
}
