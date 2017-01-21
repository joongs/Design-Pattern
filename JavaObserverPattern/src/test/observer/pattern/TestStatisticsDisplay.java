package test.observer.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import weatherdata.observer.pattern.StatisticsDisplay;
import weatherdata.observer.pattern.WeatherData;

public class TestStatisticsDisplay {

	@Test
	public void shouldGetLatestWeatherDataWhenCallMeasurementsChanged() {
		//arrange
		StatisticsDisplay display = new StatisticsDisplay();
		WeatherData data = new WeatherData(null, display);
		
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
		StatisticsDisplay statistics = new StatisticsDisplay();
		WeatherData data = new WeatherData(null, statistics);
		data.setTemperature(10.0F);
		data.setHumidity(10.0F);
		data.setPressure(10.0F);
		
		//act
		data.setTemperature(20.0F);
		data.setHumidity(20.0F);
		data.setPressure(20.0F);
		data.measurementsChanged();
		String contents = statistics.display();
		
		//assert
		assertEquals("온도 : 20.0, 습도 : 20.0, 기압 : 20.0", contents);
	}
}
