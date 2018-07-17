package creational.factory;

public class CarribicVenezia extends Pizza{

	public CarribicVenezia(PizzaIngredientFactory ingredientFactory) {
		super("Carribic Venezia", 370, ingredientFactory);
	}
}
