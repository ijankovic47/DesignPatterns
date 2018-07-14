package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent{

	private String name;
	private List<MenuComponent> components;
	
	public Menu(String name) {
		this.name=name;
		components=new ArrayList<>();
	}
	@Override
	protected void print() {
		System.out.println(this.name);
	}
	@Override
	protected void add(MenuComponent menuComponent) {
		this.components.add(menuComponent);
	}
	@Override
	protected Iterator<MenuComponent> getIterator() {
		
		return components.iterator();
	}
	@Override
	protected String getName() {
		
		return this.name;
	}
}
