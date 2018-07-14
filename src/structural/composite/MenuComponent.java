package structural.composite;

import java.util.Iterator;

public abstract class MenuComponent {

	protected void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	protected void remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	protected MenuComponent getChild(){
		throw new UnsupportedOperationException();
	}
	protected String getName(){
		throw new UnsupportedOperationException();
	}
	protected double getPrice(){
		throw new UnsupportedOperationException();
	}
	protected void print(){
		throw new UnsupportedOperationException();
	}
	protected abstract Iterator<MenuComponent> getIterator();
}
