package behavioral.iterator;

import java.util.Iterator;

public class PastaHouseMenu implements Menu{

	MenuItem[] items;
	
	public PastaHouseMenu() {
		
		items=new MenuItem[3];
		items[0]=new MenuItem("Spaghetti Bolognese", 6);
		items[1]=new MenuItem("Spaghetti Milanese", 7);
		items[2]=new MenuItem("Spaghetti Amatriciana", 8);
	}
	@Override
	public Iterator<?> getIterator() {
		
		return new ArrayIterator<>(items);
	}

}
