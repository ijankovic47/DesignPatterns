package behavioral.template;

public abstract class CaffeineBeverage {

	public final void prepare() {
		hookMethod();
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	protected void hookMethod() {
		System.out.println("We are preparing some beverage");
	}
	
	protected void boilWater() {
		System.out.println("Boiling water");
	}
	
	protected abstract void brew();
	
	protected void pourInCup() {
		System.out.println("Pouring beverage into cup");
	}
	
	protected abstract void addCondiments();
}
