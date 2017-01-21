package test.observer.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import weatherdata.observer.pattern.CurrentConditionDisplay;
import weatherdata.observer.pattern.WeatherData;

public class TestCurrentConditionDisplay {
	
	@Test
	public void shouldGetLatestWeatherDataWhenCallMeasurementsChanged() {
		//arrange
		CurrentConditionDisplay display = new CurrentConditionDisplay();
		WeatherData data = new WeatherData(display);
		data.setTemperature(10.0F);
		data.setHumidity(10.0F);
		data.setPressure(10.0F);
		
		//act
		data.measurementsChanged();
		
		//assert
		assertEquals(10.0F, display.getTemperature(), 0.0000001);
		assertEquals(10.0F, display.getHumidity(), 0.0000001);
		assertEquals(10.0F, display.getPressure(), 0.0000001);
		
	}
	
	@Test
	public void shouldSeeCurrentConditionWhenCallDisplay() {
		//arrange
		CurrentConditionDisplay currentCondition = new CurrentConditionDisplay();
		WeatherData data = new WeatherData(currentCondition);		
		data.setTemperature(10.0F);
		data.setHumidity(10.0F);
		data.setPressure(10.0F);
		
		//act
		data.setTemperature(11.0F);
		data.setHumidity(11.0F);
		data.setPressure(11.0F);
		data.measurementsChanged();
		String contents = currentCondition.display();
		
		//assert
		assertEquals("온도 : 11.0, 습도 : 11.0, 기압 : 11.0", contents);
	}
}
