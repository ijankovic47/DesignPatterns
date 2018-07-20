package structural.adapter;

public class Main {

	public static void main(String[] args) {
		
		Target t=new Adapter(new Adaptee());
		t.request();
	}

}
