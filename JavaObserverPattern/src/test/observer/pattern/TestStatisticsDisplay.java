package test.observer.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import weatherdata.observer.pattern.StatisticsDisplay;
import weatherdata.observer.pattern.WeatherData;

public class TestStatisticsDisplay {

	@Test
	public void shouldGetLatestWeatherDataWhenCallMeasurementsChanged() {
		//arrange
		WeatherData data = new WeatherData();
		StatisticsDisplay display = new StatisticsDisplay(data);		
		
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
		StatisticsDisplay statistics = new StatisticsDisplay(data);
		
		//act
		data.setMeasurements(20.0F, 20.0F, 20.0F);
		String contents = statistics.display();
		
		//assert
		assertEquals("온도 : 20.0, 습도 : 20.0, 기압 : 20.0", contents);
	}
}
