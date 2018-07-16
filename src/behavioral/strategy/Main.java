package behavioral.strategy;

public class Main {

	public static void main(String[] args) {
		
	
		ShoppingCart sc = new ShoppingCart();
		sc.add(new Item(11.21));
		sc.add(new Item(2.14));
		
		sc.pay(new CashPayment());
	}

}
