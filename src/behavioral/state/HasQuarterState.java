package behavioral.state;

public class HasQuarterState extends GumballMachineState{

	public HasQuarterState(GumballMachine gumballMachine) {
		super(gumballMachine);
	}

	@Override
	public void insertQuarter() {
		System.out.println("You already inserted a quarter.");
	}

	@Override
	public void ejectQuarter() {
	      System.out.println("The quarter is ejected.");
	      super.gumballMachine.setState(super.gumballMachine.noQuarterState);
	}

	@Override
	public void turnCrank() {
		System.out.println("The ctack turned.");
		super.gumballMachine.setState(super.gumballMachine.soldState);
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed.");
	}

}
