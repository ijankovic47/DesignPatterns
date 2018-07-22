package behavioral.state;

public class SoldState extends GumballMachineState{

	public SoldState(GumballMachine gumballMachine) {
		super(gumballMachine);
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, gumball in progress...");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, the crank is turned, no going back from here.");
	}

	@Override
	public void turnCrank() {

		System.out.println("You turned the crank twice, but you get only one gumball smartass.");
	}

	@Override
	public void dispense() {
		super.gumballMachine.releaseBall();
		if(super.gumballMachine.getCount()>0) {
			super.gumballMachine.setState(super.gumballMachine.noQuarterState);
		}
		else {
			System.out.println("No more gumballs, need refill.");
			super.gumballMachine.setState(super.gumballMachine.soldOutState);
		}
	}

}
