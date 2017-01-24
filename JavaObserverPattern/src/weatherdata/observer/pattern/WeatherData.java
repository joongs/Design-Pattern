package weatherdata.observer.pattern;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private float temperature;
	private float humidity;
	private float pressure;
	private ArrayList<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
//	public void setTemperature(float temperature) {
//		this.temperature = temperature;
//	}
//	
//	public float getTemperature() {
//		return temperature;
//	}
//
//	public void setHumidity(float humidity) {
//		this.humidity = humidity;
//	}
//
//	public float getHumidity() {
//		return humidity;
//	}
//
//	public void setPressure(float pressure) {
//		this.pressure = pressure;
//	}
//
//	public float getPressure() {
//		return pressure;
//	}
}
