package creational.factory;

public class Main {

	public static void main(String[] args) {
		
		PizzaStore ps=new CarribicPizzaStore();
		ps.orderPizza(CarribicPizzaStore.PizzaType.capricciosa);
		ps.orderPizza(CarribicPizzaStore.PizzaType.venezia);
	}

}
