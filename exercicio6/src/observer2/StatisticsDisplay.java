package observer2;

public class StatisticsDisplay extends WeatherDataObserver{

	public StatisticsDisplay(WeatherData data) {
		super(data);
	}

	@Override
	public void display() {
		System.out.println(">>> Statistics: ");
		System.out.println("Temperature: " + data.getTemperature());
		System.out.println("Humidity: " + data.getHumidity());
		System.out.println("Pressure: " + data.getPressure());	
	}
}
