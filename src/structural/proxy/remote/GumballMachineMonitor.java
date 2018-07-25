package structural.proxy.remote;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import behavioral.state.GumballMachine;

public class GumballMachineMonitor {

	public static void main(String[] args) {
		
		GumballMachineRemote machine;
		try {
			LocateRegistry.createRegistry(1099);
			GumballMachineRegistrator.register(new GumballMachine("Zemun", 2));
			
			Registry registry=LocateRegistry.getRegistry("localhost", 1099);
			machine = (GumballMachineRemote) registry.lookup("gumball@Zemun"); //proxy
			System.out.println("Location: "+machine.getLocation());
			System.out.println("Gumballs left: "+machine.getCount());
			System.out.println("State: "+machine.getState());
			
			machine.releaseBall();
			System.out.println("Gumballs left: "+machine.getCount());
			
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
