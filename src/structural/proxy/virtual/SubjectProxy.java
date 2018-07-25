package structural.proxy.virtual;

public class SubjectProxy implements Subject {

	RealSubject realSubject;

	public SubjectProxy(RealSubject realSubject) {

		this.realSubject=realSubject;
	}

	@Override
	public void doSomeTimeConsumingAction() {

		new Thread(new Runnable() {

			@Override
			public void run() {
				realSubject.doSomeTimeConsumingAction();
			}
		}).start();
	}

}
