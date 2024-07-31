package observerPattern;

public class WeatherStation {

	public static void main(String[] args) {
			WeatherData weatherData=new WeatherData();
			CurrentConditionsDisplay currentDisplay=
					new CurrentConditionsDisplay(weatherData);
			currentDisplay.update(10, 10, 10);
			currentDisplay.display();
			//StatisticsDisplay statisDisplay=new StatisticsDisplay(weatherData);
	}

}
