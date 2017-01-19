package test.observer.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import weatherdata.observer.pattern.WeatherData;

public class TestWeatherData {

	@Test
	public void testGetTemperatureWhenCallGetTemperature() {
		//arrange
		WeatherData weatherData = new WeatherData();
		weatherData.setTemperature(72.0F);
		
		//act
		float temperature = weatherData.getTemperature();
		
		//assert
		assertEquals(72.0F, temperature, 0.0000001);
	}
	
	@Test
	public void testHumidityWhenCallGetHumidity() {
		//arrange
		WeatherData weatherData = new WeatherData();
		weatherData.setHumidity(60.0F);
		
		//act
		float humidity = weatherData.getHumidity();
		
		//assert
		assertEquals(60.0F, humidity, 0.0000001);	
	}
	
	@Test
	public void testGetPressureWhenCallGetPressure() {
		//arrange
		WeatherData weatherData = new WeatherData();
		weatherData.setPressure(30.0F);
		
		//act
		float pressure = weatherData.getPressure();
		
		//assert
		assertEquals(30.0F, pressure, 0.0000001);
	}
}
