package structural.proxy.virtual;

public class RealSubject implements Subject{

	@Override
	public void doSomeTimeConsumingAction() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Action completed.");
	}

}
