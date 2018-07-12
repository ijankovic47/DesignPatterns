package behavioral.iterator;

public class Main {

	public static void main(String[] args) {
		
		Menu pastaHouseMenu=new PastaHouseMenu();
		Menu pizzaHouseMenu=new PizzaHouseMenu();
		
		Waitress waitress=new Waitress(pastaHouseMenu, pizzaHouseMenu);
		waitress.listAllMeals();
	}

}
