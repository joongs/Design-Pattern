package test.observer.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import weatherdata.observer.pattern.CurrentConditionDisplay;
import weatherdata.observer.pattern.WeatherData;

public class TestCurrentConditionDisplay {
	
	@Test
	public void shouldGetLatestWeatherDataWhenCallMeasurementsChanged() {
		//arrange
		WeatherData data = new WeatherData();
		CurrentConditionDisplay display = new CurrentConditionDisplay(data);
		
		//act
		data.setMeasurements(10.0F, 10.0F, 10.0F);
		
		//assert
		assertEquals(10.0F, display.getTemperature(), 0.0000001);
		assertEquals(10.0F, display.getHumidity(), 0.0000001);
		assertEquals(10.0F, display.getPressure(), 0.0000001);
	}
	
	@Test
	public void shouldSeeCurrentConditionWhenCallDisplay() {
		//arrange
		WeatherData data = new WeatherData();		
		CurrentConditionDisplay currentCondition = new CurrentConditionDisplay(data);
		
		//act
		data.setMeasurements(11.0F, 11.0F, 11.0F);
		String contents = currentCondition.display();
		
		//assert
		assertEquals("온도 : 11.0, 습도 : 11.0, 기압 : 11.0", contents);
	}
}
