package test.observer.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import weatherdata.observer.pattern.ForcastDisplay;
import weatherdata.observer.pattern.WeatherData;

public class TestForcastDisplay {

	@Test
	public void shouldGetLatestWeatherDataWhenCallMeasurementsChanged() {
		//arrange
		ForcastDisplay display = new ForcastDisplay();
		WeatherData data = new WeatherData(null, null, display);
		
		//act
		data.setTemperature(10.0F);
		data.setHumidity(10.0F);
		data.setPressure(10.0F);
		data.measurementsChanged();
		
		//assert
		assertEquals(10.0F, display.getTemperature(), 0.0000001);
		assertEquals(10.0F, display.getHumidity(), 0.0000001);
		assertEquals(10.0F, display.getPressure(), 0.0000001);
	}
	
	@Test
	public void shouldSeeLatestDataWhenCallMeasurementsChanged() {
		//arrange
		ForcastDisplay display = new ForcastDisplay();
		WeatherData data = new WeatherData(null, null, display);
		data.setTemperature(10.0F);
		data.setHumidity(10.0F);
		data.setPressure(10.0F);
		
		//act
		data.setTemperature(20.0F);
		data.setHumidity(20.0F);
		data.setPressure(20.0F);
		data.measurementsChanged();
		String contents = display.display();
		
		//assert
		assertEquals("온도 : 20.0, 습도 : 20.0, 기압 : 20.0", contents);
		
	}

}
