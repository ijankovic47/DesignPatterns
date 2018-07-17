package creational.factory;

public abstract class PizzaStore {
	
	public void orderPizza(Enum pizzaType) {
		
		Pizza pizza=createPizza(pizzaType);
		System.out.println(pizza.toString());
	
	}
	protected abstract Pizza createPizza(Enum pizzaType);
}
