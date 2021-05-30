package observer2;

public class ForecastDisplay extends WeatherDataObserver {

	public ForecastDisplay(WeatherData data) {
		super(data);
	}
	
	public void display() {
		System.out.println(">>> Forecast: ");
		System.out.println("Temperature: " + data.getTemperature());
		System.out.println("Humidity: " + data.getHumidity());
		System.out.println("Pressure: " + data.getPressure());
		
	}
}
