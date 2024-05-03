// PaymentStrategy.java
package org.howard.edu.lsp.oopfinal.question2;

//Strategy Pattern: an algorithm or behavior to be selected at runtime
public class PaymentStrategyDriver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        // This shows how cart of ShoppingCart can make use of setPaymentStrategy to set the 
        // payment method, and accordingly checkout with the given double value with checkout function

        // Credit Card Payment
        PaymentStrategy creditCardStrategy = new CreditCardPayment("5555-0000-1111-2222");
        cart.setPaymentStrategy(creditCardStrategy);
        cart.checkout(1220.0);

        // PayPal Payment
        PaymentStrategy paypalStrategy = new PayPalPayment("randomemail@gmail.com");
        cart.setPaymentStrategy(paypalStrategy);
        cart.checkout(1880.0);

        // Bitcoin Payment
        PaymentStrategy bitcoinStrategy = new BitcoinPayment("123fsdfdghxz11");
        cart.setPaymentStrategy(bitcoinStrategy);
        cart.checkout(7195.0);
    }
}
