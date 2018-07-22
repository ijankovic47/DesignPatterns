package behavioral.state;

public class GumballMachine {

	SoldOutState soldOutState=new SoldOutState(this);
	NoQuarterState noQuarterState=new NoQuarterState(this);
	HasQuarterState hasQuarterState=new HasQuarterState(this);
	SoldState soldState=new SoldState(this);
	
	private GumballMachineState state;
	private int count;
	
	public GumballMachine(int count) {

		this.count=count;
		if(count>0) {
			this.state=this.noQuarterState;
		}
		else {
			this.state=this.soldOutState;
		}
	}
	public void setState(GumballMachineState state) {
		this.state=state;
	}
	public void insertQuarter() {
		state.insertQuarter();
	}
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	public void turnCrank() {
		state.turnCrank();
	}
	public void disense() {
		state.dispense();
	}
	public void releaseBall() {
		System.out.println("Please take your gumball and leave...");
		count--;
	}
	public void refill(int count) {
		this.count=count;
	}
	public int getCount() {
		return this.count;
	}
}
