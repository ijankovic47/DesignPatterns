package structural.proxy.protection;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) {

		Person proxy = null;
		try {
			proxy = ProxyCreator.createProxy(new Employee("Ivan", 24), BlockSetInvocationHandler.class);
			
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Person age: "+proxy.getAge());
		proxy.setAge(12);
	}
}
