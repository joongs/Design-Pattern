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
		return "�µ� : " + temperature + ", ���� : " + humidity + ", ��� : " + pressure;
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
