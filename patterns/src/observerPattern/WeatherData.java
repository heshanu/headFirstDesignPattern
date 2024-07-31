package observerPattern;

public class WeatherData {
	private double temperature;

	public double getTemperature() {
		return temperature;
	}

	public double getHumdity() {
		return humdity;
	}

	public double getPressure() {
		return pressure;
	}

	public double getMeasurementChanged() {
		return measurementChanged;
	}

	private double humdity;
	private double pressure;
	private double measurementChanged;

}
