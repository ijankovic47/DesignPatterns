package behavioral.state;

public class SoldOutState extends GumballMachineState{

	public SoldOutState(GumballMachine gumballMachine) {
		super(gumballMachine);
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can't insert quarter, the machine is empty.");
	}

	@Override
	public void ejectQuarter() {
	
		System.out.println("Nothing to eject.");
	}

	@Override
	public void turnCrank() {
		
		System.out.println("The machine is empty and you haven't inserted a quarter.");
	}

	@Override
	public void dispense() {
		System.out.println("Nothing to dispense and you haven't inserted a quarter.");
	}

}
