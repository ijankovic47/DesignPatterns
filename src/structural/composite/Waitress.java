package structural.composite;

import java.util.Iterator;

public class Waitress {

	private Iterator<MenuComponent> menuIterator;
	
	public Waitress(Iterator<MenuComponent> menuIterator) {

		this.menuIterator=menuIterator;
	}
	public void listAllMenus(){
		while(menuIterator.hasNext()){
			MenuComponent mc=(MenuComponent) menuIterator.next();
			mc.print();
		}
	}
}
