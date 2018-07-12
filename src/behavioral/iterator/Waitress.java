package behavioral.iterator;

import java.util.Iterator;

public class Waitress {

	private Menu[] menus;
	public Waitress(Menu...menus) {
		this.menus=menus;
	}
	
	public void listAllMeals(){
		Iterator<?> i=null;
		for(Menu m:menus){
			i=m.getIterator();
			while(i.hasNext()){
				System.out.println(i.next());
			}
		}
	}
}
