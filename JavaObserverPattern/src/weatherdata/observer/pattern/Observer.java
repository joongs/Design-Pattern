package weatherdata.observer.pattern;

public interface Observer {

	public void update(float temp, float humidity, float pressure);

}