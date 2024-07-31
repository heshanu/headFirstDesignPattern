package observerPattern;

public class ForecastDisplay implements Observer,DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public  ForecastDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humdity, float pressure) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Forecast conditions:"
		+temperature+"F degree and "+humidity+"% humidity");
	}

}
