package behavioral.observer;

public class Main {

	public static void main(String[] args) {
		
		WeatherStation ws=new WeatherStation();
		PressureDisplay csd=new PressureDisplay(ws);
		TemperatureDisplay td=new TemperatureDisplay(ws);
		
		ws.setMeasurements(31, 15, 1001);
	}
}
