package observerPattern;

public class ThirdPartDisplay implements Observer,DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public ThirdPartDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("This is ThirdParty; conditions:"+temperature+"F degree and "+humidity+"% humidity");
	}
	
	@Override
	public void update(float temp, float humdity, float pressure) {
		this.temperature=temp;
		this.humidity=humdity;
	
	}


}
