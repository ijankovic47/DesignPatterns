package structural.facade;

public class PopcornPopper {

	public void on() {
		System.out.println("Popcorn popper is on.");
	}
	public void pop() {
		System.out.println("Popcorns are being prepared...");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Popcorns are ready !");
			}
		}).start();
	}
}
