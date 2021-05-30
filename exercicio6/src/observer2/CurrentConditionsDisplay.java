package observer2;

public class CurrentConditionsDisplay extends WeatherDataObserver {
	
	public CurrentConditionsDisplay(WeatherData data) {
		super(data);
	}

	public void display() {
		System.out.println(">>> Current conditions: ");
		System.out.println("Temperature: " + data.getTemperature());
		System.out.println("Humidity: " + data.getHumidity());
		System.out.println("Pressure: " + data.getPressure());
		
	}
}
