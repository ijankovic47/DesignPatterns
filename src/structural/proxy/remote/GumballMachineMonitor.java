package structural.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import structural.proxy.remote.gumball.GumballMachine;

public class GumballMachineMonitor {

	public static void main(String[] args) {
		
		GumballMachineRemote machine;
		try {
			//LocateRegistry.createRegistry(1099);
			GumballMachineRegistrator.register(new GumballMachine("Zemun", 2));
			machine = (GumballMachineRemote) Naming.lookup("gumball@Zemun");
			System.out.println("Location: "+machine.getLocation());
			System.out.println("Gumballs left: "+machine.getCount());
			System.out.println("State: "+machine.getState());
			
			machine.releaseBall();
			System.out.println("Gumballs left: "+machine.getCount());
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
