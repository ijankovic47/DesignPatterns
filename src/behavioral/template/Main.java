package behavioral.template;

public class Main {

	public static void main(String[] args) {
		
		Coffee c=new Coffee();
		c.prepare();
		
		System.out.println();
		
		Tea t=new Tea();
		t.prepare();
	}

}
