package behavioral.strategy;

public class CashPayment implements PaymentMethod{

	@Override
	public void pay(Double amount) {
		
		System.out.println("Payment done by cash. Amount: "+amount);
	}

}
