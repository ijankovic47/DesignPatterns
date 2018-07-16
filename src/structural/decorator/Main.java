package structural.decorator;

public class Main {

	public static void main(String[] args) {
		
		Beverage espresso=new Espresso();
		espresso.getBeverageInfo();
		
		espresso=new MilkDecorator(espresso);
		espresso.getBeverageInfo();
		
		espresso=new SugarDecorator(espresso);
		espresso.getBeverageInfo();
		
		espresso=new CreamDecorator(espresso);
		espresso.getBeverageInfo();
	}

}
