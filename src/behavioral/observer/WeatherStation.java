package behavioral.observer;

import java.util.Observable;

public class WeatherStation extends Observable{

	private double temperature;
	private double humidity;
	private double pressure;
	
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}
	private void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	public double getTemperature() {
		return temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
}
