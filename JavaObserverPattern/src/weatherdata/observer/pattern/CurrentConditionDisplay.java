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
