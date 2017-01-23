package weatherdata.observer.pattern;

public class WeatherData {

	private float temperature;
	private float humidity;
	private float pressure;
	private Observer currentConditionDisplay;
	private StatisticsDisplay statisticsDisplay;
	private ForcastDisplay forcastDisplay;
	
	public WeatherData(Observer currentConditionDisplay, StatisticsDisplay statisticsDisplay, ForcastDisplay forcastDisplay) {
		this.currentConditionDisplay = currentConditionDisplay;
		this.statisticsDisplay = statisticsDisplay;
		this.forcastDisplay = forcastDisplay;
	}
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	public float getTemperature() {
		return temperature;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getPressure() {
		return pressure;
	}

	public void measurementsChanged() {
		float temp = this.getTemperature();
		float humidity = this.getHumidity();
		float pressure = this.getPressure();
		
		if (currentConditionDisplay != null) {
			currentConditionDisplay.update(temp, humidity, pressure);
		}
		
		if (statisticsDisplay != null) {
			statisticsDisplay.update(temp, humidity, pressure);
		}
		
		if (forcastDisplay != null) {
			forcastDisplay.update(temp, humidity, pressure);
		}
	}
}
