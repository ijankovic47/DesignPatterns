package behavioral.state;

public abstract class GumballMachineState {

	protected GumballMachine gumballMachine;
	
	public GumballMachineState(GumballMachine gumballMachine) {

		this.gumballMachine=gumballMachine;
	}
	
	abstract void insertQuarter();
	abstract void ejectQuarter();
	abstract void turnCrank();
	abstract void dispense();
}
