package structural.composite;

public class Main {

	public static void main(String[] args) {

		MenuComponent allMenus = new Menu("All Menus");
		MenuComponent pastaHouseMenu = new Menu("Pasta House Menu");
		MenuComponent pizzaHouseMenu = new Menu("Pizza House Menu");
		MenuComponent desertMenu = new Menu("Pasta House Desert Menu");
		
		pastaHouseMenu.add(new MenuItem("Spaghetti Bolognese", 9.67));
		pastaHouseMenu.add(new MenuItem("Spaghetti Milanese", 11.05));
		pizzaHouseMenu.add(new MenuItem("Capricciosa", 14));
		pizzaHouseMenu.add(new MenuItem("Margherita", 15.12));
		desertMenu.add(new MenuItem("Choco Waffle", 5.43));
		pastaHouseMenu.add(desertMenu);
		
		
		allMenus.add(pastaHouseMenu);
		allMenus.add(pizzaHouseMenu);
		
		Waitress w=new Waitress(new CompositeIterator(allMenus.getIterator()));
		w.listAllMenus();
	
	}

}
