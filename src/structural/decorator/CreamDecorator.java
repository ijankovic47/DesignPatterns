package structural.decorator;

public class CreamDecorator extends BeverageDecorator{

	public CreamDecorator(Beverage beverage) {
		super(beverage, "Cream" , 2);
	}
}
