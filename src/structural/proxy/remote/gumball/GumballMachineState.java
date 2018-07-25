package structural.proxy.remote.gumball;

import java.io.Serializable;

public abstract class GumballMachineState implements Serializable{

	protected transient GumballMachine gumballMachine;
	
	public GumballMachineState(GumballMachine gumballMachine) {

		this.gumballMachine=gumballMachine;
	}
	
	abstract void insertQuarter();
	abstract void ejectQuarter();
	abstract void turnCrank();
	abstract void dispense();
}
