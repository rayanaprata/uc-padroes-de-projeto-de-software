package observer2;

public class MainAntes {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData(0, 0, 0);
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(1, 1, 1);
		
		currentDisplay.setData(weatherData);
		statisticsDisplay.setData(weatherData);
		forecastDisplay.setData(weatherData);
		
		currentDisplay.display();
		statisticsDisplay.display();
		forecastDisplay.display();
		
		weatherData.setMeasurements(1, 2, 3);
		
		currentDisplay.setData(weatherData);
		statisticsDisplay.setData(weatherData);
		forecastDisplay.setData(weatherData);
		
		currentDisplay.display();
		statisticsDisplay.display();
		forecastDisplay.display();
		
		
	}

}

//>>> Current conditions: 
//Temperature: 1.0
//Humidity: 1.0
//Pressure: 1.0
//>>> Statistics: 
//Temperature: 1.0
//Humidity: 1.0
//Pressure: 1.0
//>>> Forecast: 
//Temperature: 1.0
//Humidity: 1.0
//Pressure: 1.0
//>>> Current conditions: 
//Temperature: 1.0
//Humidity: 2.0
//Pressure: 3.0
//>>> Statistics: 
//Temperature: 1.0
//Humidity: 2.0
//Pressure: 3.0
//>>> Forecast: 
//Temperature: 1.0
//Humidity: 2.0
//Pressure: 3.0

