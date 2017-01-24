package test.observer.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import weatherdata.observer.pattern.CurrentConditionDisplay;
import weatherdata.observer.pattern.ForcastDisplay;
import weatherdata.observer.pattern.StatisticsDisplay;
import weatherdata.observer.pattern.WeatherData;

public class TestWeatherData {

	@Test
	public void testGetTemperatureWhenCallGetTemperature() {
		//arrange
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
		
		//act
		weatherData.setMeasurements(11.0F, 11.0F, 11.0F);
		
		//assert
		assertEquals("�µ� : 11.0, ���� : 11.0, ��� : 11.0", currentDisplay.display());
		assertEquals("�µ� : 11.0, ���� : 11.0, ��� : 11.0", statisticsDisplay.display());
		assertEquals("�µ� : 11.0, ���� : 11.0, ��� : 11.0", forcastDisplay.display());
	}
}
