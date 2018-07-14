package structural.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent{

	private String name;
	private double price;
	
	public MenuItem(String name, double price) {

		this.name=name;
		this.price=price;
	}
	@Override
	protected String getName() {
		
		return this.name;
	}
	public void print() {
		System.out.println("----------"+name+":     "+price);
	}

	@Override
	protected Iterator<MenuComponent> getIterator() {
		return new NullIterator();
	} 
}
