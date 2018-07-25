package structural.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BlockSetInvocationHandler<T extends Person> implements InvocationHandler {

	private T type;

	public BlockSetInvocationHandler(T type) {

		this.type = type;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (method.getName().startsWith("set")) {
			throw new IllegalAccessError("You can not use 'set' methods, I won't let you!");
		} else {
			return method.invoke(type, args);
		}
	}
}
