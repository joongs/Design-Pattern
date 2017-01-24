package test.observer.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import weatherdata.observer.pattern.ForcastDisplay;
import weatherdata.observer.pattern.WeatherData;

public class TestForcastDisplay {

	@Test
	public void shouldGetLatestWeatherDataWhenCallMeasurementsChanged() {
		//arrange
		WeatherData data = new WeatherData();
		ForcastDisplay display = new ForcastDisplay(data);
		
		//act
		data.setMeasurements(10.0F, 10.0F, 10.0F);
		
		//assert
		assertEquals(10.0F, display.getTemperature(), 0.0000001);
		assertEquals(10.0F, display.getHumidity(), 0.0000001);
		assertEquals(10.0F, display.getPressure(), 0.0000001);
	}
	
	@Test
	public void shouldSeeLatestDataWhenCallMeasurementsChanged() {
		//arrange
		WeatherData data = new WeatherData();
		ForcastDisplay display = new ForcastDisplay(data);
		
		//act
		data.setMeasurements(20.0F, 20.0F, 20.0F);
		String contents = display.display();
		
		//assert
		assertEquals("온도 : 20.0, 습도 : 20.0, 기압 : 20.0", contents);
	}
}
