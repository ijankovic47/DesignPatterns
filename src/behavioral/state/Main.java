package behavioral.state;

public class Main {

	public static void main(String[] args) {
		
		GumballMachine gumbalMachine=new GumballMachine(1);
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
