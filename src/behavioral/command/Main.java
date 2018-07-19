package behavioral.command;

public class Main {

	public static void main(String[] args) {
		
		Light l=new Light("Kitchen");
		Slot slot=new Slot(new ToggleLightCommand(l));
		
		for(int i=1;i<=100;i++) {
			new Thread(new SlotRapist(slot)).start();
		}
		
		l.getState();
		
	}

}
