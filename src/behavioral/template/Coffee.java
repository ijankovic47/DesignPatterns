package behavioral.template;

public class Coffee extends CaffeineBeverage{

	@Override
	protected void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding milk and sugar");
	}
	
	@Override
	protected void hookMethod() {
		System.out.println("We are preparing coffee");
	}

}
