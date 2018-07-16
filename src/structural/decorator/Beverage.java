package structural.decorator;

public abstract class Beverage {

	private String name;
	private double price;
	
	public Beverage(String name, double price) {
		this.name=name;
		this.price=price;
	}
	
	public void getBeverageInfo() {
		System.out.println(this.name+": "+this.price);
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
}
