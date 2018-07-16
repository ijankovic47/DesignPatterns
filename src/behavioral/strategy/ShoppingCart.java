package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;
	
	public ShoppingCart() {
		items=new ArrayList<Item>();
	}
	public void pay(PaymentMethod paymentMethod) {
		paymentMethod.pay(totalCost());
	}
	public void add(Item item) {
		items.add(item);
	}
	private double totalCost() {
		double amount=0;
		for(Item i:items) {
			amount+=i.getPrice();
		}
		return amount;
	}
}
