package creational.factory;

public class CarribicPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Sauce createSauce() {
	
		return new CarribicPizzaSauce();
	}

}
