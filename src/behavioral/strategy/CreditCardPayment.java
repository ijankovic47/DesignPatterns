package behavioral.strategy;

public class CreditCardPayment implements PaymentMethod{

	@Override
	public void pay(Double amount) {
		
		System.out.println("Payment done using credit card. Amount: "+amount);
	}

}
