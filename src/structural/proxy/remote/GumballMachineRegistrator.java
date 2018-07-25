package structural.proxy.remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMachineRegistrator {

	public static void register(GumballMachineRemote machine) {

		System.setProperty("java.security.policy", "file:./security.policy");

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			Registry registry=LocateRegistry.getRegistry(1099);
			registry.rebind("gumball@" + machine.getLocation(), machine);

		} catch (Exception e) {
			System.err.println("Exception:" + e);
			e.printStackTrace();
		}
	}
}
