package structural.decorator;

public abstract class BeverageDecorator extends Beverage{

	public BeverageDecorator(Beverage beverage, String decoration, double price) {
		super(beverage.getName()+" + "+decoration, beverage.getPrice()+price);
	}
}
