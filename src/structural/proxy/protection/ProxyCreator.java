package structural.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class ProxyCreator {

	@SuppressWarnings("unchecked")
	static <T extends Person, I extends InvocationHandler> T createProxy(T type, Class<I> handler)
			throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		
		InvocationHandler han = handler.getDeclaredConstructor(new Class[] { Person.class }).newInstance(type);
		return (T) Proxy.newProxyInstance(type.getClass().getClassLoader(), type.getClass().getInterfaces(), han);
	}

}
