package behavioral.state;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		GumballMachine gumbalMachine=new GumballMachine("Location1", 1);
		gumbalMachine.ejectQuarter();
		gumbalMachine.turnCrank();
		gumbalMachine.disense();
		gumbalMachine.insertQuarter();
		System.out.println();
		gumbalMachine.insertQuarter();
		gumbalMachine.disense();
		gumbalMachine.ejectQuarter();
		gumbalMachine.insertQuarter();
		gumbalMachine.turnCrank();
		System.out.println();
		gumbalMachine.insertQuarter();
		gumbalMachine.ejectQuarter();
		gumbalMachine.turnCrank();
		gumbalMachine.disense();
		System.out.println();
		gumbalMachine.insertQuarter();
	}

}
