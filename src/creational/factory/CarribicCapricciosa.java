package creational.factory;

public class CarribicCapricciosa extends Pizza{

	public CarribicCapricciosa(PizzaIngredientFactory ingredientFactory) {
		super("Carribic Capricciosa", 350, ingredientFactory);
	}
}
