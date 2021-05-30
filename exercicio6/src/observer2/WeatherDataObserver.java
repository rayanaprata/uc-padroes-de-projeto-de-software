package observer2;

public abstract class WeatherDataObserver implements Observer {
  WeatherData data;
  
  public WeatherDataObserver(WeatherData data) {
    data.addObserver(this);
		this.data = data;
  }

  @Override
	public void update(Object data) {
    this.data = (WeatherData)data;
    this.display();
  }
  
  protected abstract void display();

  public WeatherData getData() {
		return data;
	}

	public void setData(WeatherData data) {
		this.data = data;
	}
}
