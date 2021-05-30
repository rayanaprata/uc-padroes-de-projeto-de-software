package observer2;

public class WeatherData extends Observable {

	private double temperature, humidity, pressure;
	
	public WeatherData(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}
	
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.notifyObservers(this);
	}
}
