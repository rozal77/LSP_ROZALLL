package org.howard.edu.lsp.oopfinal.question2;

	public class BitcoinPayment implements PaymentStrategy {
	    private String bitcoinAddress;
	    
	    
	    // constructor to store the butcoin address for the payment type
	    public BitcoinPayment(String bitcoinAddress) {
	        this.bitcoinAddress = bitcoinAddress;
	    }

	    @Override
	    // overrides the function accordingly for this class, does similarly for all classes
	    // like CreditCardPayment and PayPalPayment
	    public void pay(double amount) {
	        System.out.println("Paid " + amount + " using Bitcoin address " + bitcoinAddress);
	    }
	}
