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

package weatherdata.observer.pattern;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	public String display() {
		return "온도 : " + temperature + ", 습도 : " + humidity + ", 기압 : " + pressure;
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}

package weatherdata.observer.pattern;

public class StatisticsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;
	

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	public String display() {
		return "온도 : " + temperature + ", 습도 : " + humidity + ", 기압 : " + pressure;
	}
	
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}

package weatherdata.observer.pattern;

public class ForcastDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;

	public ForcastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public String display() {
		return "온도 : " + temperature + ", 습도 : " + humidity + ", 기압 : " + pressure;
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}

package weatherdata.observer.pattern;

public interface DisplayElement {

	public String display();

}

package weatherdata.observer.pattern;

public interface Observer {

	public void update(float temp, float humidity, float pressure);

}

package weatherdata.observer.pattern;

public interface Subject {

	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();

}
