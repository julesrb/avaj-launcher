package avaj;

class WeatherProvider {

	private static WeatherProvider instance = new WeatherProvider();

	private WeatherProvider() {}

	public static WeatherProvider getInstance() {
		return instance;
	}

	private String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};


	public String getCurrentWeather(Coordinates p_coordinates) {
		return "haha";
	}
}