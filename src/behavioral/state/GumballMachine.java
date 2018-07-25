package behavioral.state;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import structural.proxy.remote.GumballMachineRemote;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

	SoldOutState soldOutState=new SoldOutState(this);
	NoQuarterState noQuarterState=new NoQuarterState(this);
	HasQuarterState hasQuarterState=new HasQuarterState(this);
	SoldState soldState=new SoldState(this);
	
	private GumballMachineState state;
	private int count;
	private String location;
	
	public GumballMachine(String location, int count) throws RemoteException{

		this.location=location;
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
	@Override
	public void releaseBall() {
		System.out.println("Gumball released.");
		count--;
	}
	public void refill(int count) {
		this.count=count;
	}
	public int getCount() {
		return this.count;
	}
	@Override
	public String getLocation() throws RemoteException {
		// TODO Auto-generated method stub
		return this.location;
	}
	@Override
	public String getState() throws RemoteException {
		// TODO Auto-generated method stub
		return this.state.getClass().getSimpleName();
	}
}
