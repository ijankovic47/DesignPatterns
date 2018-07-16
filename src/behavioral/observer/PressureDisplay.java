package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class PressureDisplay implements Observer{

	private Observable observable;
	private double pressure;
	
	public PressureDisplay(Observable observable) {

		this.observable=observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof WeatherStation) {
			WeatherStation es=(WeatherStation) o;
			this.pressure=es.getPressure();
			display();
		}
	}
	public void display() {
		System.out.println("Pressure: "+this.pressure);
	}

}
