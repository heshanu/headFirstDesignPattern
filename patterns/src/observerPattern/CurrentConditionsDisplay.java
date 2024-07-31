package observerPattern;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
		weatherData.removeObserver(this);
	}

	@Override
	public void update(float temp, float humdity, float pressure) {
		this.temperature=temp;
		this.humidity=humdity;
		this.pressure=pressure;
	
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions:"+temperature+"F degree and "+humidity+"% humidity "+"pressure is "+pressure);
	}

	
}
