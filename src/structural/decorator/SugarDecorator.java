package structural.decorator;

public class SugarDecorator extends BeverageDecorator{

	public SugarDecorator(Beverage beverage) {
		super(beverage, "Sugar", 1);
	}
}
