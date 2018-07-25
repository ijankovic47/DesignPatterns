package structural.proxy.virtual;

public class Main {

	public static void main(String[] args) {
		
		RealSubject realSubject=new RealSubject();
		System.out.println("We trigger some action that is time consuming, and we have to wait...");
		System.out.println("Time consuming action started...");
		realSubject.doSomeTimeConsumingAction();
		System.out.println();
		
		SubjectProxy sp=new SubjectProxy(realSubject);
		System.out.println("But with proxy we don't wait.");
		System.out.println("Time consuming action started...");
		sp.doSomeTimeConsumingAction();
		System.out.println("Proxy in this case makes sure that new thread is triggered before the method call is delegated"
				+ " to the real executor.");
	}

}
