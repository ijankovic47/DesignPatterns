package behavioral.command;

public class Light {

	private String location;
	private boolean lightOn;
	
	public Light(String location) {

		this.location=location;
		lightOn=false;
	}
	
	public void getState() {
		System.out.println(lightOn?Thread.currentThread().getName()+" "+location+" light is on":Thread.currentThread().getName()+" "+location+ " light is off");
	}
	
	public void toggleLight() {
		lightOn=!lightOn;
	}
}
