package creational.factory;

public class CarribicPizzaStore extends PizzaStore {

	public static enum PizzaType {
		capricciosa, venezia
	}
	
	private PizzaIngredientFactory ingredientFactory=new CarribicPizzaIngredientFactory();

	@Override
	protected Pizza createPizza(Enum pizzaType) {

		if (pizzaType.equals(CarribicPizzaStore.PizzaType.capricciosa)) {
			return new CarribicCapricciosa(ingredientFactory);
		} else if (pizzaType.equals(CarribicPizzaStore.PizzaType.venezia)) {
			return new CarribicVenezia(ingredientFactory);
		}
		return null;
	};

}
