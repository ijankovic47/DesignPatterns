package structural.facade;

public class DvdPlayer {

	public void play(String movie) {
		
		while(Thread.activeCount()>1) {
			System.out.println("Waiting for popcorns to pop...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Playing "+movie+"...");
	}
}
