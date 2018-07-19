package behavioral.command;

public class SlotRapist implements Runnable{

	Slot slot;
	
	public SlotRapist(Slot slot) {
		this.slot=slot;
	}
	@Override
	public void run() {
		
		slot.click();
	}
  
}
