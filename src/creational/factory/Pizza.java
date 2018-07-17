package creational.factory;

public abstract class Pizza {

	private String name;
	private double price;
	private Sauce sauce;

	public Pizza(String name, double price, PizzaIngredientFactory ingredientFactory) {

		this.name=name;
		this.price=price;
		this.sauce=ingredientFactory.createSauce();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return this.name+"("+sauce.getName()+"): "+this.price;
	}
}
