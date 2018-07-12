package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PizzaHouseMenu implements Menu{

	private List<MenuItem> items;
	
	public PizzaHouseMenu() {
		
		items=new ArrayList<>();
		items.add(new MenuItem("Capricciosa", 10));
		items.add(new MenuItem("Margerita", 11));
	}
	@Override
	public Iterator<?> getIterator() {
		return items.iterator();
	}
}
