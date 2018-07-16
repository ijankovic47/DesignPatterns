package structural.decorator;

public abstract class BeverageDecorator extends Beverage{

	public BeverageDecorator(Beverage beverage, String decoration, double price) {

		super(beverage.getName(), beverage.getPrice());
		super.setName(super.getName()+" + "+decoration);
		super.setPrice(super.getPrice()+price);
	}
	
	@Override
	public void getBeverageInfo() {
		System.out.println(super.getName()+": "+super.getPrice());
	}
}
