package behavioral.command;

public class Slot {

	private Command command;
	
	public Slot(Command command) {

		this.command=command;
	}
	
	public void setComand(Command command) {
		this.command=command;
	}
	
	public void click() {
		command.execute();
	}
}
