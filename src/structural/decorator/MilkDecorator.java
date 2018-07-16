package structural.decorator;

public class MilkDecorator extends BeverageDecorator{

	public MilkDecorator(Beverage beverage) {
		super(beverage, "Milk", 3);
	}
}
