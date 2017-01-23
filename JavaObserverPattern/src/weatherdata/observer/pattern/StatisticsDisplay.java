package weatherdata.observer.pattern;

public class StatisticsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public String display() {
		return "온도 : " + temperature + ", 습도 : " + humidity + ", 기압 : " + pressure;
	}
}
