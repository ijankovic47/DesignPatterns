package behavioral.template;

public class Tea extends CaffeineBeverage{

	@Override
	protected void brew() {
		System.out.println("Steeping the teabag");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding lemon");
	}
}
