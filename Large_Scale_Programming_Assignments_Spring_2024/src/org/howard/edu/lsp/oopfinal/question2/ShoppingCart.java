package org.howard.edu.lsp.oopfinal.question2;
 
	public class ShoppingCart {
	    private PaymentStrategy paymentStrategy;
	    
	    // sets the payment strategy

	    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
	        this.paymentStrategy = paymentStrategy;
	    }

	    public void checkout(double amt) {
	        paymentStrategy.pay(amt);
	    }
	}

