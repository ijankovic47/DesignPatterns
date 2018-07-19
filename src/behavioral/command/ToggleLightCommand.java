package behavioral.command;

public class ToggleLightCommand implements Command{

	Light light;
	
	public ToggleLightCommand(Light light) {

		this.light=light;
	}
	
	public void setLight(Light light) {
		this.light=light;
	}
	
	@Override
	public void execute() {
		light.toggleLight();
		light.getState();
	}

}
