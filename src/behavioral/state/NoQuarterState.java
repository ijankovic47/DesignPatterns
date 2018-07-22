package behavioral.state;

public class NoQuarterState extends GumballMachineState{

	public NoQuarterState(GumballMachine gumballMachine) {
		super(gumballMachine);
	}

	@Override
	public void insertQuarter() {
		System.out.println("The quarter is inserted.");
		super.gumballMachine.setState(super.gumballMachine.hasQuarterState);
	}

	@Override
	public void ejectQuarter() {

		System.out.println("Can't eject, no quarter inserted.");
	}

	@Override
	public void turnCrank() {
		System.out.println("Crack turned, but no quarter inserted.");
	}

	@Override
	public void dispense() {

		System.out.println("Can't dispense, no qurter inserted.");
	}

}
