package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class TemperatureDisplay implements Observer{

	private Observable observable;
	private double temperature;
	
	public TemperatureDisplay(Observable observable) {

		this.observable=observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof WeatherStation) {
			WeatherStation ws=(WeatherStation) o;
			this.temperature=ws.getTemperature();
			display();
		}
		
	}
	public void display() {
		System.out.println("Temperature: "+this.temperature);
	}

}
